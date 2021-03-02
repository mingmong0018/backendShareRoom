package Spboot.sroom.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import Spboot.sroom.dto.RoomDetailVO;
import Spboot.sroom.dto.RoomOptionVO;
import Spboot.sroom.dto.RoomTagVO;
import Spboot.sroom.dto.RoomVO;

@Mapper
public interface IRoomDao {
	public List<RoomVO> getAllRoom();
	public RoomDetailVO getRoom(int roomId);
	public List<RoomTagVO> getRoomTag(int roomId);
	public List<RoomOptionVO> getRoomOption(int roomId);
	public void insertKeyword(String mem_id, String keyword);
	public int getWishRoom(String mem_id, int room_id);
	public void insertWishList(String mem_Id, int room_id);
	public void deleteWishList(String mem_Id, int room_id);
}
