package Spboot.sroom.controller;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Calendar;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

import Spboot.sroom.dto.MemberVO;
import Spboot.sroom.oauth.GoogleUserInfo;
import Spboot.sroom.oauth.UserInfo;
import Spboot.sroom.service.IMemberService;

@Controller
public class MemberController {
	
	@Value("${googleClientSecret}")
	String googleClientSecret;
	@Value("${googleApiKey}")
	String googleApiKey;
	@Value("${jwt.secret}")
	String tokenSecret;
	
	
	@Autowired
	IMemberService ms;
	UserInfo userInfo;
	
	
	
	

	@RequestMapping(value = "/login", method = {RequestMethod.GET,RequestMethod.POST})
	public String login(Locale locale, Model model,
			@RequestParam(value = "code") String code,
			@RequestParam(value = "state") String state)throws Exception{
		
		String currentPath=null;
		String clientSecret=null;
		String apiKey=null;
		
			String[] stateCurrent = state.split("_");
			state=stateCurrent[0];
			currentPath=stateCurrent[1];
			System.out.println("state : "+state);
			System.out.println("currentPath : "+currentPath);
			if(state.equals("g")) {
				userInfo=new GoogleUserInfo();
				clientSecret=googleClientSecret;
				apiKey=googleApiKey;
			}else if(state.equals("naver")) {
				
			}else {
				
			}
	//		code를 보낼준비
			String clientId=userInfo.getClientId();
			String redirectURI=userInfo.getRedirectURI();
			String apiURL=userInfo.getApiURL();
			apiURL += "?code=" + code;
			apiURL += "&client_id=" + clientId;
			apiURL += "&client_secret=" + clientSecret;
			apiURL += "&redirect_uri=" + redirectURI;
			apiURL += "&grant_type=" + "authorization_code";
			System.out.println("state : "+state);
			String access_token="";
	//		String refresh_token="";
			
			//code를 보냄
			try {
				URL url=new URL(apiURL);
				HttpURLConnection con = (HttpURLConnection)url.openConnection();
				con.setRequestMethod("POST");
				
				con.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
				con.setFixedLengthStreamingMode(0);
				con.setDoOutput(true);
				int responseCode = con.getResponseCode();
				System.out.println("con : "+con);
				System.out.println("responseCode : "+responseCode);
				BufferedReader br;
	
	            if(responseCode==200) { // 정상 호출
	                br = new BufferedReader(new InputStreamReader(con.getInputStream()));
	            } else {  // 에러 발생
	                br = new BufferedReader(new InputStreamReader(con.getErrorStream()));
	            }
	            String inputLine;
	            StringBuffer res = new StringBuffer();
	            while ((inputLine = br.readLine()) != null) {
	                res.append(inputLine);
	            }
	            br.close();
	            
	//            성공적으로 토큰을 가져온다면
				if(responseCode==200) { 
					
					
	                String name, email, tmp,profile_image,id;
	                char gender;
	                int age;
	                MemberVO mvo=new MemberVO();
	                
	                
	//               accessToken을 이용해서 사용자 정보를 Json로 값 가져오기
	                JsonParser jsonParser = new JsonParser();
	                JsonElement accessElement = jsonParser.parse(res.toString());
	                access_token = accessElement.getAsJsonObject().get("access_token").getAsString();
	                tmp = ms.getUserInfo(access_token,userInfo.getAccessTokenApiURL());
	                JsonElement userInfoElement = jsonParser.parse(tmp);
	                userInfo.setField(userInfoElement);
	                
	//              필드에 값 넣기
	                id = state+"_"+userInfo.getId();
	                Calendar cal=Calendar.getInstance();
	                int year=cal.get(Calendar.YEAR);
	                age = year-userInfo.getAge()+1;
	                name=userInfo.getName();
	                email = userInfo.getEmail();
	                profile_image = userInfo.getImage();
	                gender = userInfo.getGender();
	                System.out.println(id+age+name+email+profile_image+gender);
	 
	//              회원가입 안되어있으면
	                if(!id.equals(ms.searchMember(id))){
	                mvo.setId(id);
	                mvo.setName(name);
	                mvo.setNickname(name);
	                mvo.setEmail(email);
	                mvo.setAge(age);
	                mvo.setGender(gender);
	                mvo.setImage(profile_image);
	                ms.insertMember(mvo);
	                }
	//				jwt생성
	                access_token = ms.createJWTToken(id,name,email,tokenSecret);
	                
	                
	                
	               
	                
				}
	
	
			} catch (Exception e) {
				e.printStackTrace();
			}
			return "redirect:"+currentPath+"?token="+access_token;
			
			

	}
	
	
	
	
	
	
	
	
	
}
