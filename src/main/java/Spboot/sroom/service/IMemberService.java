package Spboot.sroom.service;

import java.util.List;

import Spboot.sroom.dto.KeywordVO;
import Spboot.sroom.dto.MemberVO;

public interface IMemberService {
	public void deleteAllKeyword(String id);
	public void deleteKeyword(String id,int keyword_id);
	public List<KeywordVO> getAllKeyword(String id);
	public void insertKeyword(KeywordVO kvo);
	public void updateMemberWithOutImage(MemberVO mvo);
	public void updateMember(MemberVO mvo);
	public MemberVO getMember(String id);
	public String searchMember(String id);
	public void insertMember(MemberVO mvo);
	public String getUserInfo(String access_token,String apiURL);
}
