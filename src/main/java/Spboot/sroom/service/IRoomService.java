package Spboot.sroom.service;

import java.util.List;

import Spboot.sroom.dto.MemberVO;
import Spboot.sroom.dto.OptionVO;
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
	public int insertWishList(String mem_id, int room_id);
	public int deleteWishList(String mem_id, int room_id);
	public List<RoomVO> getWishRoomAll(String mem_id);
	public List<OptionVO> getOptions();
	public int getInsertRoomId(RoomDetailVO rdvo);
	public void insertOption(int roomId, String option);
	public Integer getMyRoom(String mem_id);
	public int updateRoom(String title, String address, String updateImage, int deposit, int rent, String report, int roomId);
	public void updateOption(int roomId, String option);
	public void insertTag(int roomId, String roomTag);
	public void updateTag(int roomId, String roomTag);
	public int deleteRoom(int roomId);
}
