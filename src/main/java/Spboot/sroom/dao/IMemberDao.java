package Spboot.sroom.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import Spboot.sroom.dto.KeywordVO;
import Spboot.sroom.dto.MemberVO;

@Mapper
public interface IMemberDao {
	public String getEmail(String id);
	public String getConfirm(String id);
	public void updateKeyword(KeywordVO kvo);
	public String confirmKeyword(KeywordVO kvo);
	public void deleteAllKeyword(String id);
	public void deleteKeyword(String id,int keyword_id);
	public List<KeywordVO> getAllKeyword(String id);
	public void insertKeyword(KeywordVO kvo);
	public void updateMemberWithOutImage(MemberVO mvo);
	public void updateMember(MemberVO mvo);
	public MemberVO getMember(String id);
	public String searchMember(String id);
	public void insertMember(MemberVO mvo);
	
}
