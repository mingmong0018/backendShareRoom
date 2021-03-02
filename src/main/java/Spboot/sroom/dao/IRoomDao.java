package Spboot.sroom.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import Spboot.sroom.dto.RoomDetailVO;
import Spboot.sroom.dto.RoomOptionVO;
import Spboot.sroom.dto.RoomTagVO;
import Spboot.sroom.dto.RoomVO;

@Mapper
public interface IRoomDao {
	List<RoomVO> getAllRoom();
	RoomDetailVO getRoom(int roomId);
	List<RoomTagVO> getRoomTag(int roomId);
	List<RoomOptionVO> getRoomOption(int roomId);
}
