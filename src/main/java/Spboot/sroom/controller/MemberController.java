package Spboot.sroom.controller;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Calendar;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import Spboot.sroom.dto.MemberVO;
import Spboot.sroom.oauth.GoogleUserInfo;
import Spboot.sroom.oauth.KakaoUserInfo;
import Spboot.sroom.oauth.NaverUserInfo;
import Spboot.sroom.oauth.UserInfo;
import Spboot.sroom.redis.IUseRedis;
import Spboot.sroom.redis.UseRedis;
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
	public String updateMember(
			@RequestParam(value = "id") String id,
			@RequestParam(value = "email") String email,
			@RequestParam(value = "nickname") String nickname,
			@RequestParam(value = "age") int age) {
		System.out.println(id+email+nickname+age);
		MemberVO mvo=new MemberVO();
		mvo.setMem_id(id);
		mvo.setMem_nickname(nickname);
		mvo.setMem_age(age);
		ms.updateMember(mvo);
		System.out.println("나 작동됐니..?");
		return "success";
	}
	
	@RequestMapping(value="/getMember",method= {RequestMethod.POST})
	public MemberVO getMember(@RequestParam(value = "id") String id) {
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
	                
	
			return JWTtoken+","+name+","+id;
			
			

	}
	
	
	
	
	
	
	
	
	
}
