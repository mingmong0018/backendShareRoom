package Spboot.sroom.dao;

import org.apache.ibatis.annotations.Mapper;

import Spboot.sroom.dto.MemberVO;

@Mapper
public interface IMemberDao {
	public void updateMemberWithOutImage(MemberVO mvo);
	public void updateMember(MemberVO mvo);
	public MemberVO getMember(String id);
	public String searchMember(String id);
	public void insertMember(MemberVO mvo);
	
}
