package Spboot.sroom.controller;

import java.io.File;
import java.io.IOException;
import java.sql.Timestamp;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import Spboot.sroom.dto.KeywordVO;
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
   
   
   @Autowired
   IMemberService ms;
   
   UserInfo userInfo;
   
   
   @Autowired
   IJwtUtil jwtUtil;
   @Autowired
   IUseRedis useRedis;
   
   @RequestMapping(value="/memberEmail",method= {RequestMethod.POST})
   public String memberEmail(@RequestParam(value = "id") String id) {
      String result=ms.getEmail(id);
      return result;
      
      
   }
   
   @RequestMapping(value="/memberConfirm",method= {RequestMethod.POST})
   public String memberConfirm(@RequestParam(value = "id") String id) {
      String result=ms.getConfirm(id);
      return result;
      
      
   }
   
   @RequestMapping(value="/deleteKeyword",method= {RequestMethod.POST})
   public String deleteKeyword(@RequestParam(value = "id") String id,
                                    @RequestParam(value = "keywordSq") int keyword_id) {
      ms.deleteKeyword(id,keyword_id);
      return "1";
      
   }
   @RequestMapping(value="/deleteAllKeyword",method= {RequestMethod.POST})
   public String deleteAllKeyword(@RequestParam(value = "id") String id) {
      ms.deleteAllKeyword(id);
      return "1";
      
   }
   
   @RequestMapping(value="/getAllSearchText",method= {RequestMethod.POST})
   public List<KeywordVO> getAllSearchText(@RequestParam(value = "id") String id) {
      List<KeywordVO> keyword=ms.getAllKeyword(id);
      return keyword;
      
   }

   @RequestMapping(value="/savingSearchText",method= {RequestMethod.POST})
   public void savingSearchText(@RequestParam(value = "id") String id,
         @RequestParam(value = "searchText") String text) {
      KeywordVO kvo=new KeywordVO();
      kvo.setMemId(id);
      kvo.setKeywordContent(text);
      Timestamp now=new Timestamp(System.currentTimeMillis());
      kvo.setKeywordIndate(now);
      ms.insertKeyword(kvo);
      
      
      
   }
   
   @RequestMapping(value="/updateMember",method= {RequestMethod.POST})
   public String updateMember(HttpServletRequest request) {
//	   HttpSession session = request.getSession();
//	   ServletContext context = session.getServletContext();
//	   String savePath = File.separator+context.getRealPath("upload");
//	   System.out.println("savePath realPath : "+File.separator+context.getRealPath("/"));
//	   System.out.println("savePath : "+savePath);
      String savePath=File.separator+"home"+File.separator+"ubuntu"+File.separator+"Shareroom"+File.separator+"src"+File.separator+"main"+File.separator+"webapp"+File.separator+"upload";
      System.out.println(savePath);
      int sizeLimit=10*1024*1024;
      try {
         MultipartRequest multi=new MultipartRequest(request,savePath,sizeLimit,"UTF-8",new DefaultFileRenamePolicy());
         String id=multi.getParameter("id");
         char gender=multi.getParameter("gender").charAt(0);
         int age=Integer.parseInt(multi.getParameter("age"));
         String nickname=multi.getParameter("nickname");
         String email=multi.getParameter("email");
         String image=null;
         MemberVO mvo=new MemberVO();
         mvo.setMem_id(id);
         mvo.setMem_email(email);
         mvo.setMem_nickname(nickname);
         mvo.setMem_gender(gender);
         mvo.setMem_age(age);
         
         if(multi.getFilesystemName("image")!=null) {
            image=multi.getFilesystemName("image");
            
            mvo.setMem_image("http://3.34.142.121:8070/upload/"+image);
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
   
   @CrossOrigin("*")
   @GetMapping(value="/getMember")
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
                  
                   Calendar cal=Calendar.getInstance();
                   int year=cal.get(Calendar.YEAR);
                   age = year-userInfo.getAge()+1;
                   if(userInfo.getAge()==0) {
                      age=0;
                   }
                   id = state+"_"+userInfo.getId();
                   name=userInfo.getName();
                   profile_image = userInfo.getImage();
                   gender = userInfo.getGender();
                   email=userInfo.getEmail();
                   
                   System.out.println(id+"\n"+age+"\n"+name+profile_image+gender+email);
    
   //              회원가입 안되어있으면
                   if(!id.equals(ms.searchMember(id))){
                  
                   mvo.setMem_id(id);
                   mvo.setMem_email(email);
                   mvo.setMem_name(name);
                   mvo.setMem_nickname(name);
                   mvo.setMem_age(age);
                   mvo.setMem_gender(gender);
                   mvo.setMem_image(profile_image);
                   ms.insertMember(mvo);
                   }
                   
                   
//               jwt생성  
                   JWTtoken = jwtUtil.createJWT(id,name);
                   System.out.println("userName : "+userInfo.getName());
                   System.out.println(JWTtoken);
                   
                   
////                   redis사용
//                   ValueOperations<String,Object>vop=redisTemplate.opsForValue();
//                   vop.set(id, JWTtoken);
//                   String result = (String) vop.get(id);
//                   useRedis=new UseRedis();
                   useRedis.setField(id,JWTtoken);
                   System.out.print("redis:"+useRedis.getField(id));



   
         return JWTtoken+","+name+","+id;
         
         

   }
   
   
   
   
   
   
   
   
   
}