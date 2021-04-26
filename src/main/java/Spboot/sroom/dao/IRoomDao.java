package Spboot.sroom.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import Spboot.sroom.dto.BestTagVO;
import Spboot.sroom.dto.OptionVO;
import Spboot.sroom.dto.RoomDetailVO;
import Spboot.sroom.dto.RoomOptionVO;
import Spboot.sroom.dto.RoomTagVO;
import Spboot.sroom.dto.RoomVO;

@Mapper
public interface IRoomDao {
   public List<RoomVO> getAllRoom();
   public RoomDetailVO getRoom(int roomId);
   public List<RoomTagVO> getRoomTag(int roomId);
   public List<RoomOptionVO> getRoomOption(int roomId);
   public void insertKeyword(String mem_id, String keyword);
   public Integer getWishRoom(String mem_id, int room_id);
   public int insertWishList(String mem_Id, int room_id);
   public int deleteWishList(String mem_Id, int room_id);
   public List<RoomVO> getWishList(String mem_id);
   public List<OptionVO> getOptions();
   public int insertRoom(RoomDetailVO rdvo);
   public Integer getInsertRoomId(String mem_id);
   public void insertOption(int roomId, String option);
   public Integer getMyRoom(String mem_id);
   public int updateRoom(String title, String address, String updateImage, int deposit, int rent, String report, int roomId);
   public void deleteOption(int roomId);
   public void insertTag(int roomId, String roomTag);
   public void deleteTag(int roomId);
   public int deleteRoom(int roomId);
   public int deleteRoomOption(int roomId);
   public int deleteRoomTag(int roomId);
   public List<BestTagVO> getBestTags();
   public List<RoomTagVO> getTagRoomsList(String tag);
   public RoomVO getTagRoom(int room_id);
}