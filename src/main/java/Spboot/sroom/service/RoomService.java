package Spboot.sroom.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Spboot.sroom.dao.IRoomDao;
import Spboot.sroom.dto.MemberVO;
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

	@Override
	public void insertKeyword(String mem_id, String keyword) {
		rdao.insertKeyword(mem_id, keyword);
	}

	@Override
	public boolean getWishList(String mem_id, int room_id) {
		String roomId = String.valueOf(rdao.getWishRoom(mem_id, room_id));
		if(roomId!="") return true;
		else return false;
	}

	@Override
	public void insertWishList(String mem_id, int room_id) {
		rdao.insertWishList(mem_id, room_id);
	}

	@Override
	public void deleteWishList(String mem_id, int room_id) {
		rdao.deleteWishList(mem_id, room_id);
	}
}
