package Spboot.sroom.service;

import Spboot.sroom.dto.MemberVO;

public interface IMemberService {
	public MemberVO getMember(String id);
	public String searchMember(String id);
	public void insertMember(MemberVO mvo);
	public String getUserInfo(String access_token,String apiURL);
}
