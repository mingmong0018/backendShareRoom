package Spboot.sroom.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Spboot.sroom.dao.IRoomDao;
import Spboot.sroom.dto.RoomDetailVO;
import Spboot.sroom.dto.RoomOptionVO;
import Spboot.sroom.dto.RoomTagVO;
import Spboot.sroom.dto.RoomVO;
import Spboot.sroom.dto.WishListVO;


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
	public boolean getWishRoom(String mem_id, int room_id) {
		Integer roomId = rdao.getWishRoom(mem_id, room_id);
		System.out.print("roomId"+roomId);
		if(roomId!=null) return true;
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

	@Override
	public List<RoomVO> getWishRoomAll(String mem_id) {
		List<RoomVO> wishList = rdao.getWishList(mem_id);
		return wishList;
	}
}
