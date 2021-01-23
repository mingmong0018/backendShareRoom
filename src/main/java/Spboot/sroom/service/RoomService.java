package Spboot.sroom.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Spboot.sroom.dao.IRoomDao;
import Spboot.sroom.dto.RoomVO;



@Service
public class RoomService implements IRoomService{
	
	@Autowired
	IRoomDao rdao;

	@Override
	public List<RoomVO> getAllRoom() {
		return rdao.getAllRoom();
	}
}
