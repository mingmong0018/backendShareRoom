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

	@Override
	public MemberVO getMember(String id) {
		return mdao.getMember(id);
	}

	@Override
	public void updateMember(MemberVO mvo) {
		mdao.updateMember(mvo);
	}
	}

