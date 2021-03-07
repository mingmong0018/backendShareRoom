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
	public boolean getWishList(String mem_id, int room_id);
	public void insertWishList(String mem_Id, int room_id);
	public void deleteWishList(String mem_Id, int room_id);
}
