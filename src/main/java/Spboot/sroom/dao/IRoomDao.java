package Spboot.sroom.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import Spboot.sroom.dto.RoomVO;

@Mapper
public interface IRoomDao {
	List<RoomVO> getAllRoom();
}
