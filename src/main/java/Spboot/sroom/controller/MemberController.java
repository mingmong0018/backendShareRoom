package Spboot.sroom.controller;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.swing.filechooser.FileSystemView;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.ui.Model;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import Spboot.sroom.dto.MemberVO;
import Spboot.sroom.oauth.GoogleUserInfo;
import Spboot.sroom.oauth.KakaoUserInfo;
import Spboot.sroom.oauth.NaverUserInfo;
import Spboot.sroom.oauth.UserInfo;
import Spboot.sroom.redis.IUseRedis;
import Spboot.sroom.service.IMemberService;
import Spboot.sroom.util.IJwtUtil;

@RestController
public class MemberController {
	
	@Value("${googleClientSecret}")
	String googleClientSecret;
	@Value("${googleApiKey}")
	String googleApiKey;
	
	
	@Autowired
	IMemberService ms;
	
	UserInfo userInfo;
	
	
	
//	@Autowired
//	RedisTemplate<String,Object> redisTemplate;
	
	@Autowired
	IJwtUtil jwtUtil;
	@Autowired
	IUseRedis useRedis;

	
	@RequestMapping(value="/updateMember",method= {RequestMethod.POST})
	public String updateMember(HttpServletRequest request) {
		String savePath=request.getServletContext().getRealPath("upload");
		System.out.println(request.getContextPath());
		int sizeLimit=10*1024*1024;
		try {
			MultipartRequest multi=new MultipartRequest(request,savePath,sizeLimit,"UTF-8",new DefaultFileRenamePolicy());
			String id=multi.getParameter("id");
			char gender=multi.getParameter("gender").charAt(0);
			int age=Integer.parseInt(multi.getParameter("age"));
			String nickname=multi.getParameter("nickname");
			String image=null;
			MemberVO mvo=new MemberVO();
			mvo.setMem_id(id);
			mvo.setMem_nickname(nickname);
			mvo.setMem_gender(gender);
			mvo.setMem_age(age);
			
			if(multi.getFilesystemName("image")!=null) {
				image=multi.getFilesystemName("image");
				
				mvo.setMem_image("http://localhost:8070/upload/"+image);
				ms.updateMember(mvo);
				System.out.println("이미지 있으");
			}else {
				ms.updateMemberWithOutImage(mvo);
				System.out.println("이미지 없으");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("나 작동됐니..?");
		return "success";
	}
	
	@RequestMapping(value="/getMember",method= {RequestMethod.POST})
	public MemberVO getMember(@RequestParam(value = "id") String id) {
		System.out.println("나 작동됐니..?222");
		return ms.getMember(id);
	}
	
	
	
	
	@RequestMapping(value = "/login", method = {RequestMethod.GET,RequestMethod.POST})
	public String login(Locale locale, Model model,
			@RequestParam(value = "accessToken") String accessToken,
			@RequestParam(value = "state") String state)throws Exception{
		System.out.println("accessToken : "+accessToken);
		
		String JWTtoken=null;
		
		if(state.equals("google")) {
			userInfo=new GoogleUserInfo();
		}else if(state.equals("naver")) {
			userInfo=new NaverUserInfo();
		}else if(state.equals("kakao")) {
			userInfo=new KakaoUserInfo();
		}
				

	                String name, email, tmp,profile_image,id;
	                char gender;
	                int age;
	                MemberVO mvo=new MemberVO();
	                
	                
	//               accessToken을 이용해서 사용자 정보를 Json로 값 가져오기
	                JsonParser jsonParser = new JsonParser();
	                tmp = ms.getUserInfo(accessToken,userInfo.getAccessTokenApiURL());
	                JsonElement userInfoElement = jsonParser.parse(tmp);
	                System.out.println(tmp);
	                userInfo.setField(userInfoElement);
	                
	//              필드에 값 넣기
	                id = state+"_"+userInfo.getId();
	                System.out.print("id:"+id);
	                Calendar cal=Calendar.getInstance();
	                int year=cal.get(Calendar.YEAR);
	                age = year-userInfo.getAge()+1;
	                if(userInfo.getAge()==1000) {
	                	age=900;
	                }
	                name=userInfo.getName();
	                profile_image = userInfo.getImage();
	                gender = userInfo.getGender();
	                if(userInfo.getGender()=='A') {
	                	gender='A';
	                }
	                System.out.println(id+age+name+profile_image+gender);
	 
	//              회원가입 안되어있으면
	                if(!id.equals(ms.searchMember(id))){
	                mvo.setMem_id(id);
	                mvo.setMem_name(name);
	                mvo.setMem_nickname(name);
	                mvo.setMem_age(age);
	                mvo.setMem_gender(gender);
	                mvo.setMem_image(profile_image);
	                ms.insertMember(mvo);
	                }
	                
	                
//					jwt생성  
	                JWTtoken = jwtUtil.createJWT(id,name);
	                System.out.println("userName : "+userInfo.getName());
	                System.out.println(JWTtoken);
	                
	                
////	                redis사용
//	                ValueOperations<String,Object>vop=redisTemplate.opsForValue();
//	                vop.set(id, JWTtoken);
//	                String result = (String) vop.get(id);
//	                useRedis=new UseRedis();
	                useRedis.setField(id,JWTtoken);
	                System.out.print("redis:"+useRedis.getField(id));



	
			return JWTtoken+","+name+","+id;
			
			

	}
	
	
	
	
	
	
	
	
	
}
