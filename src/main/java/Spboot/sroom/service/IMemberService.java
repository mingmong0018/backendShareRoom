package Spboot.sroom.service;

import Spboot.sroom.dto.MemberVO;

public interface IMemberService {
	public String searchMember(String id);
	public void insertMember(MemberVO mvo);
	public String createJWTToken(String id,String name,String email,String tokenSecret);
	public String getUserInfo(String access_token,String apiURL);
}
