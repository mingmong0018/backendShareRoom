package Spboot.sroom.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Spboot.sroom.dao.IRoomDao;



@Service
public class RoomService implements IRoomService{
	
	@Autowired
	IRoomDao rdao;
}
