package Spboot.sroom.service;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;

import Spboot.sroom.dao.IMemberDao;
import Spboot.sroom.dao.IRoomDao;
import Spboot.sroom.dto.MemberVO;



@Service
public class MemberService implements IMemberService{
	
	@Autowired
	IMemberDao mdao;

	@Override
	public String searchMember(String id) {
		return mdao.searchMember(id);
	}

	@Override
	public void insertMember(MemberVO mvo) {
		mdao.insertMember(mvo);
		
	}

	@Override
	public String createJWTToken(String id, String name, String email, String tokenSecret) {
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

	@Override
	public String getUserInfo(String access_token,String apiURL) {
		String header="Bearer "+access_token;
		
		try {
			URL url=new URL(apiURL);
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
	}

