package Spboot.sroom.controller;

import java.util.List;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import Spboot.sroom.dto.MemberVO;
import Spboot.sroom.dto.RoomDetailVO;
import Spboot.sroom.dto.RoomOptionVO;
import Spboot.sroom.dto.RoomTagVO;
import Spboot.sroom.dto.RoomVO;
import Spboot.sroom.service.IMemberService;
import Spboot.sroom.service.IRoomService;


@RestController
public class RoomController {

	@Autowired
	IRoomService rs;
	
	@Autowired
	IMemberService ms;
	
	@RequestMapping(value="/listRoom", method={RequestMethod.GET})
    public List<RoomVO> listAll() {
		List<RoomVO> rooms = rs.getAllRoom();
		return rooms;
	}
	
	@RequestMapping(value="/roomDetail", method={RequestMethod.GET})
    public RoomDetailVO getRoom(@RequestParam(value = "roomId") int roomId) {
		RoomDetailVO room = rs.getRoom(roomId);
		return room;
	}
	
	@RequestMapping(value="/roomTag", method={RequestMethod.GET})
    public List<RoomTagVO> getRoomTag(@RequestParam(value = "roomId") int roomId) {
		List<RoomTagVO> tag = rs.getRoomTag(roomId);
		return tag;
	}
	
	@RequestMapping(value="/roomOption", method={RequestMethod.GET})
    public List<RoomOptionVO> getRoomOption(@RequestParam(value = "roomId") int roomId) {
		List<RoomOptionVO> option = rs.getRoomOption(roomId);
		return option;
	}
	
	@RequestMapping(value="/keyword", method={RequestMethod.POST})
    public void insertKeyword(
    		@RequestParam(value = "keyword") String keyword,
    		@RequestParam(value = "id") String mem_id
    		) {
		rs.insertKeyword(mem_id, keyword);
	}
	
	@RequestMapping(value="/writer", method={RequestMethod.GET})
    public MemberVO getRoomWriter(
    		@RequestParam(value = "id") String mem_id
    		) {
		MemberVO writer = ms.getMember(mem_id);
		return writer;
	}
	

	
	@GetMapping(value="/wish")
    public boolean getWishRoom(
    		@RequestParam(value = "id") String mem_id,
    		@RequestParam(value = "roomId") int room_id
    		) {
		boolean wish = rs.getWishRoom(mem_id,room_id);
		return wish;
	}
	
	@PostMapping(value="/wish")
    public void insertWishList(
    		@RequestParam(value = "id") String mem_id,
    		@RequestParam(value = "roomId") int room_id
    		) {
		System.out.print("room"+room_id);
		rs.insertWishList(mem_id,room_id);
	}
	
	@DeleteMapping(value="/wish")
    public void deleteWishList(
    		@RequestParam(value = "id") String mem_id,
    		@RequestParam(value = "roomId") int room_id
    		) {
		System.out.print("room"+room_id);
		rs.deleteWishList(mem_id,room_id);
	}
	
	@GetMapping(value="/wishList")
    public List<RoomVO> wishlistAll(
    		@RequestParam(value = "id") String mem_id
    		) {
		List<RoomVO> wishRooms = rs.getWishRoomAll(mem_id);
		return wishRooms;
	}
	
	/*
	@RequestMapping(value = "/listRoom", method = RequestMethod.GET)
    public void listAll(Model model) throws Exception {
		List<RoomVO> rooms = rs.getAllRoom();

		HashMap<String, Object> roomHashMap = new HashMap<String, Object>();
        JSONObject roomObj = new JSONObject();
        JSONObject roomImage = new JSONObject();
        JSONArray roomList = new JSONArray();
        JSONArray roomImageList = new JSONArray();
        for(int i = 0 ; i < rooms.size() ; i++) {

            roomHashMap.put("room_id",rooms.get(i).getRoom_id());
            roomHashMap.put("mem_id",rooms.get(i).getMem_id());
            roomHashMap.put("room_title",rooms.get(i).getRoom_title());
            roomHashMap.put("room_deposit",rooms.get(i).getRoom_deposit());
            roomHashMap.put("room_rent",rooms.get(i).getRoom_rent());
            roomHashMap.put("room_address",rooms.get(i).getRoom_address());
            roomHashMap.put("room_report",rooms.get(i).getRoom_report());
            roomHashMap.put("room_indate",rooms.get(i).getRoom_indate());
            
            JSONObject room = new JSONObject(roomHashMap);
            roomList.add(i,room);
            
            String room_images=rooms.get(i).getRoom_images();
            String[] images=room_images.split(",");

            HashMap<String, Object> imageMap = new HashMap<>();
            imageMap.put("image"+i,Arrays.toString(images));
            roomImageList.add(imageMap);
            
        }
        roomObj.put("RoomVO",roomList);
        roomImage.put("RoomImage",roomImageList);

        model.addAttribute("rooms",roomObj);
        model.addAttribute("images",roomImage);	
	}
	*/
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index(Locale locale, Model model) {

		return "index";		
	}
}
