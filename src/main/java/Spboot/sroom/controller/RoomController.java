package Spboot.sroom.controller;

import java.util.List;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import Spboot.sroom.dto.RoomVO;
import Spboot.sroom.service.IRoomService;


@RestController
public class RoomController {

	@Autowired
	IRoomService rs;
	
	@RequestMapping(value="/listRoom", method={RequestMethod.GET})
    public List<RoomVO> listAll(Model model) {
		List<RoomVO> rooms = rs.getAllRoom();
		return rooms;
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
