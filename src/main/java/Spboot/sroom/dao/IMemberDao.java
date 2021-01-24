package Spboot.sroom.dao;

import org.apache.ibatis.annotations.Mapper;

import Spboot.sroom.dto.MemberVO;

@Mapper
public interface IMemberDao {
	public String searchMember(String id);
	public void insertMember(MemberVO mvo);
}
