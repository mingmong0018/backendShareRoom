package Spboot.sroom.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Spboot.sroom.dao.IRoomDao;
import Spboot.sroom.dto.OptionVO;
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
	public boolean getWishRoom(String mem_id, int room_id) {
		Integer roomId = rdao.getWishRoom(mem_id, room_id);
		if(roomId!=null) return true;
		else return false;
	}

	@Override
	public int insertWishList(String mem_id, int room_id) {
		int result = rdao.insertWishList(mem_id, room_id);
		return result;
	}

	@Override
	public int deleteWishList(String mem_id, int room_id) {
		int result = rdao.deleteWishList(mem_id, room_id);
		return result;
	}

	@Override
	public List<RoomVO> getWishRoomAll(String mem_id) {
		List<RoomVO> wishList = rdao.getWishList(mem_id);
		return wishList;
	}

	@Override
	public List<OptionVO> getOptions() {
		List<OptionVO> options = rdao.getOptions();
		return options;
	}

	@Override
	public int getInsertRoomId(RoomDetailVO rdvo) {
		String mem_id=rdvo.getMem_id();
		Integer roomId=null;
		int result=rdao.insertRoom(rdvo);
		if(result==1) {
			roomId=rdao.getInsertRoomId(mem_id);
		}
		return roomId;
	}

	@Override
	public void insertOption(int roomId, String option) {
		String opt[] = option.split(",");
		for(int i=0; i<opt.length; i++) {
			String optionId=opt[i];
			rdao.insertOption(roomId, optionId);
		}
	}

	@Override
	public Integer getMyRoom(String mem_id) {
		Integer myRoom = rdao.getMyRoom(mem_id);
		return myRoom;
	}

	@Override
	public int updateRoom(String title, String address, String updateImage, int deposit, int rent, String report, int roomId) {
		int result=0;
		result=rdao.updateRoom(title, address, updateImage, deposit, rent, report, roomId);
		return result;
	}

	@Override
	public void updateOption(int roomId, String option) {
		if(option=="") {
			rdao.deleteOption(roomId);
		}else {
			rdao.deleteOption(roomId);
			String opt[] = option.split(",");
			for(int i=0; i<opt.length; i++) {
				String optionId=opt[i];
				rdao.insertOption(roomId, optionId);
			}
		}
	}

	@Override
	public void insertTag(int roomId, String roomTag) {
		String tags[] = roomTag.split(",");
		for(int i=0; i<tags.length; i++) {
			String tag=tags[i];
			rdao.insertTag(roomId, tag);
		}
		
	}

	@Override
	public void updateTag(int roomId, String roomTag) {
		if(roomTag=="") {
			rdao.deleteTag(roomId);
		}else {
			rdao.deleteTag(roomId);
			String tags[] = roomTag.split(",");
			for(int i=0; i<tags.length; i++) {
				String tag=tags[i];
				rdao.insertTag(roomId, tag);
			}
		}
	}

	@Override
	public int deleteRoom(int roomId) {
		int result=rdao.deleteRoom(roomId);
		return result;
	}

}
