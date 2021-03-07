package Spboot.sroom.service;

import java.util.List;

import Spboot.sroom.dto.MemberVO;
import Spboot.sroom.dto.RoomDetailVO;
import Spboot.sroom.dto.RoomOptionVO;
import Spboot.sroom.dto.RoomTagVO;
import Spboot.sroom.dto.RoomVO;

public interface IRoomService {
	public List<RoomVO> getAllRoom();
	public RoomDetailVO getRoom(int roomId);
	public List<RoomTagVO> getRoomTag(int roomId);
	public List<RoomOptionVO> getRoomOption(int roomId);
	public void insertKeyword(String mem_id, String keyword);
	public boolean getWishRoom(String mem_id, int room_id);
	public void insertWishList(String mem_id, int room_id);
	public void deleteWishList(String mem_id, int room_id);
	public List<RoomVO> getWishRoomAll(String mem_id);

}
