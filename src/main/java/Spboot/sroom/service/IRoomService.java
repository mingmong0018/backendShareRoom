package Spboot.sroom.service;

import java.util.List;

import Spboot.sroom.dto.RoomDetailVO;
import Spboot.sroom.dto.RoomOptionVO;
import Spboot.sroom.dto.RoomTagVO;
import Spboot.sroom.dto.RoomVO;

public interface IRoomService {
	List<RoomVO> getAllRoom();
	RoomDetailVO getRoom(int roomId);
	List<RoomTagVO> getRoomTag(int roomId);
	List<RoomOptionVO> getRoomOption(int roomId);
}
