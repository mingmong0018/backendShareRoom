package Spboot.sroom.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Date;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

import Spboot.sroom.service.IRoomService;


@Controller
public class RoomController {
	
	@Value("${googleClientSecret}")
	String googleClientSecret;
    @Value("${jwt.secret}")
    String tokenSecret;


	@Autowired
	IRoomService rs;
	
	@ResponseBody
	@RequestMapping(value = "/login", method = {RequestMethod.GET,RequestMethod.POST})
	public String login(Locale locale, Model model,@RequestParam(value = "code") String code) throws Exception{
		String googleClientId="166602658975-pu0k2i9jimdpkqn99fstlj2vnk2ct6ud.apps.googleusercontent.com";
		String googleRedirectURI="http://localhost:8070/login";
		String googleApiURL="https://accounts.google.com/o/oauth2/token";
		googleApiURL += "?code=" + code;
		googleApiURL += "&client_id=" + googleClientId;
		googleApiURL += "&client_secret=" + googleClientSecret;
		googleApiURL += "&redirect_uri=" + googleRedirectURI;
		googleApiURL += "&grant_type=" + "authorization_code";
		
		String access_token="";
		String refresh_token="";
		
		
		try {
			URL url=new URL(googleApiURL);
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

			if(responseCode==200) { // 성공적으로 토큰을 가져온다면
                String name, email, tmp,profile_image,id;
                JsonParser jsonParser = new JsonParser();
                JsonElement accessElement = jsonParser.parse(res.toString());
                access_token = accessElement.getAsJsonObject().get("access_token").getAsString();
                tmp = getUserInfo(access_token);
                JsonElement userInfoElement = jsonParser.parse(tmp);
                id = userInfoElement.getAsJsonObject().get("id").getAsString();
                name=userInfoElement.getAsJsonObject().get("name").getAsString();
                email = userInfoElement.getAsJsonObject().get("email").getAsString();
                profile_image = userInfoElement.getAsJsonObject().get("picture").getAsString();
                access_token = createJWTToken(id,name,email);
            }


		} catch (MalformedURLException e) {
			System.out.println("로그인 오류1");
		} catch (IOException e) {
			e.printStackTrace();
		}
		return "redirect:http://localhost:8080/agreement?token=" + access_token;
	}
	
	private String getUserInfo(String access_token) {
		String header="Bearer "+access_token;
		
		try {
			String googleApiURL="https://www.googleapis.com/oauth2/v3/userinfo";
			URL url=new URL(googleApiURL);
			HttpURLConnection con=(HttpURLConnection)url.openConnection();	
			con.setRequestMethod("GET");
			con.setRequestProperty("Authorization", header);
			int responseCode = con.getResponseCode();
			System.out.println("Userinfo (responseCode)  : "+responseCode);
			BufferedReader br;
			if(responseCode==200) {
				br=new BufferedReader(new InputStreamReader(con.getInputStream()));
			}else {
				br=new BufferedReader(new InputStreamReader(con.getErrorStream()));
			}
			String inputLine;
			StringBuffer res=new StringBuffer();
			while((inputLine = br.readLine())!=null) {
				res.append(inputLine);
			}
			br.close();
			return res.toString();
		} catch (Exception e) {
			return "Err";
		}
		
	}
	
	
	private String createJWTToken(String id, String name, String email) {
        String token = null;

        try {
            Long EXPIRATION_TIME = 1000L * 60L * 10L;
            Date issuedAt = new Date();
            Date notBefore = new Date(issuedAt.getTime());
            Date expiresAt = new Date(issuedAt.getTime() + EXPIRATION_TIME);

            Algorithm algorithm = Algorithm.HMAC256(tokenSecret);
            token = JWT.create()
                    .withIssuer("ShareRoom")
                    .withSubject(name)
                    .withAudience(name)
                    .withClaim("id", id)
                    .withClaim("name", name)
                    .withClaim("email", email)
                    .withNotBefore(notBefore)
                    .withExpiresAt(expiresAt)
                    .sign(algorithm);
        } catch (Exception e) {
            System.err.println("err: " + e);
        }
        return token;
    }
	
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index(Locale locale, Model model) {

		return "index";		
	}
}
