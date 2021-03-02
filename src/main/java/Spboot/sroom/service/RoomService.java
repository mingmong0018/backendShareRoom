package Spboot.sroom.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Spboot.sroom.dao.IRoomDao;
import Spboot.sroom.dto.RoomDetailVO;
import Spboot.sroom.dto.RoomOptionVO;
import Spboot.sroom.dto.RoomTagVO;
import Spboot.sroom.dto.RoomVO;


@Service
public class RoomService implements IRoomService{
	
	@Autowired
	IRoomDao rdao;

	@Override
	public List<RoomVO> getAllRoom() {
		return rdao.getAllRoom();
	}

	@Override
	public RoomDetailVO getRoom(int roomId) {
		return rdao.getRoom(roomId);
	}

	@Override
	public List<RoomTagVO> getRoomTag(int roomId) {
		return rdao.getRoomTag(roomId);
	}

	@Override
	public List<RoomOptionVO> getRoomOption(int roomId) {
		return rdao.getRoomOption(roomId);
	}
}
