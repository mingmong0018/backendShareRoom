package Spboot.sroom.service;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;

import Spboot.sroom.dao.IMemberDao;
import Spboot.sroom.dao.IRoomDao;
import Spboot.sroom.dto.KeywordVO;
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

	@Override
	public void updateMemberWithOutImage(MemberVO mvo) {
		mdao.updateMemberWithOutImage(mvo);
		
	}

	@Override
	public void insertKeyword(KeywordVO kvo) {
		if(mdao.confirmKeyword(kvo)==null) {
			mdao.insertKeyword(kvo);
		}else {
			System.out.println(kvo.getKeywordIndate());
			mdao.updateKeyword(kvo);
		}
		
	}

	@Override
	public List<KeywordVO> getAllKeyword(String id) {
		return mdao.getAllKeyword(id);
	}

	@Override
	public void deleteAllKeyword(String id) {
		mdao.deleteAllKeyword(id);
		
	}

	@Override
	public void deleteKeyword(String id, int keyword_id) {
		mdao.deleteKeyword(id,keyword_id);
		
	}

	@Override
	public String getConfirm(String id) {
		return mdao.getConfirm(id);
	}

	@Override
	public String getEmail(String id) {
		return mdao.getEmail(id);
	}
	}

