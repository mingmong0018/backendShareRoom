package Spboot.sroom.controller;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import Spboot.sroom.dto.MemberVO;
import Spboot.sroom.dto.OptionVO;
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
		System.out.println("하이");
		List<RoomVO> rooms = rs.getAllRoom();
		return rooms;
	}
	
	@RequestMapping(value="/roomDetail", method={RequestMethod.GET})
    public RoomDetailVO getRoom(@RequestParam(value = "roomId") int roomId) {
		RoomDetailVO room = rs.getRoom(roomId);
		System.out.print("방: "+room);
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
		System.out.print("옵션: "+option);
		return option;
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
    public String insertWishList(
    		@RequestParam(value = "id") String mem_id,
    		@RequestParam(value = "roomId") int room_id
    		) {
		int result = rs.insertWishList(mem_id,room_id);
		if(result==1) {
			return "OK";
		}else {
			return "";
		}
	}
	
	@DeleteMapping(value="/wish")
    public String deleteWishList(
    		@RequestParam(value = "id") String mem_id,
    		@RequestParam(value = "roomId") int room_id
    		) {
		int result = rs.deleteWishList(mem_id,room_id);
		if(result==1) {
			return "OK";
		}else {
			return "";
		}
	}
	
	@GetMapping(value="/wishList")
    public List<RoomVO> wishlistAll(
    		@RequestParam(value = "id") String mem_id
    		) {
		List<RoomVO> wishRooms = rs.getWishRoomAll(mem_id);
		return wishRooms;
	}
	
	@GetMapping(value="/options")
	public List<OptionVO> getOptions() {
		List<OptionVO> options = rs.getOptions();
		return options;
	}
	
	@PostMapping(value="/room")
	public String insertRoom(HttpServletRequest request) {
		String savePath=request.getServletContext().getRealPath("roomImages");
		System.out.println(request.getContextPath());
		int sizeLimit=1024*1024*1024;
		Integer roomId=null;
		try {
			MultipartRequest multi=new MultipartRequest(request,savePath,sizeLimit,"UTF-8",new DefaultFileRenamePolicy());

			String id=multi.getParameter("id");
			String title=multi.getParameter("title");
			String address=multi.getParameter("address");
			int deposit=Integer.parseInt(multi.getParameter("deposit"));
			int rent=Integer.parseInt(multi.getParameter("rent"));
			String report=multi.getParameter("report");
			String option=multi.getParameter("option");
			String roomTag=multi.getParameter("roomTag");
			Enumeration imageNames=multi.getFileNames();
			
			List<String> imageUrlArr = new ArrayList<String>();
			
			while(imageNames.hasMoreElements()) {		// 파일 요소의 갯수만큼 반복 실행
				String image=(String)imageNames.nextElement();
				String image_name=multi.getFilesystemName(image);
				imageUrlArr.add(image_name);
			}
			
			String url="http://13.125.175.217:8070/roomImages/";
			String images="";
			for(int i=0; i<imageUrlArr.size(); i++) {
				String imageUrl=url+imageUrlArr.get(i)+',';
				images=images+imageUrl;
			}
			images=images.substring(0, images.length() - 1);
			
			RoomDetailVO rdvo=new RoomDetailVO();
			rdvo.setMem_id(id);
			rdvo.setRoom_title(title);
			rdvo.setRoom_address(address);
			rdvo.setRoom_images(images);
			rdvo.setRoom_deposit(deposit);
			rdvo.setRoom_rent(rent);
			rdvo.setRoom_report(report);
			
			roomId = rs.getInsertRoomId(rdvo);
			
			if(option.length()>0) {
				rs.insertOption(roomId, option);
			}
			
			if(roomTag.length()>0) {
				rs.insertTag(roomId, roomTag);
			}
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.print(String.valueOf(roomId));
		return String.valueOf(roomId);
	}
	
	@PutMapping(value="/room")
	public int updateRoom(HttpServletRequest request) {
		String savePath=request.getServletContext().getRealPath("roomImages");
		int sizeLimit=1024*1024*1024;
		int result=0;
		try {
			MultipartRequest multi=new MultipartRequest(request,savePath,sizeLimit,"UTF-8",new DefaultFileRenamePolicy());

			int roomId=Integer.parseInt(multi.getParameter("roomId"));
			String title=multi.getParameter("title");
			String address=multi.getParameter("address");
			int deposit=Integer.parseInt(multi.getParameter("deposit"));
			int rent=Integer.parseInt(multi.getParameter("rent"));
			String report=multi.getParameter("report");
			String option=multi.getParameter("option");
			String roomTag=multi.getParameter("roomTag");
			Enumeration imageNames=multi.getFileNames();
			
			List<String> imageUrlArr = new ArrayList<String>();
			
			while(imageNames.hasMoreElements()) {		// 파일 요소의 갯수만큼 반복 실행
				String image=(String)imageNames.nextElement();
				String image_name=multi.getFilesystemName(image);
				imageUrlArr.add(image_name);
			}
			
			String updateImage="";
			// 기존 방 정보 불러옴(수정되기전)
			RoomDetailVO room = rs.getRoom(roomId);
			
			String roomImages[]=room.getRoom_images().split(",");
			
			if(imageUrlArr.size()>0) {
				// 기존파일 먼저 삭제
				for(int i=0; i<roomImages.length; i++) {
					String roomImage = roomImages[i].replace("http://13.125.175.217:8070/roomImages", "");
					File file=new File(savePath+roomImage);
					if(file.exists()) {
						file.delete();
						System.out.print("파일 삭제 성공");
					}else {
						System.out.print("파일이 존재하지 않습니다");
					}
				}
				
				String url="http://13.125.175.217:8070/roomImages/";
				String images="";
				for(int i=0; i<imageUrlArr.size(); i++) {
					String imageUrl=url+imageUrlArr.get(i)+',';
					images=images+imageUrl;
				}
				images=images.substring(0, images.length() - 1);
				updateImage=images;
			}else {
				updateImage=room.getRoom_images();
			}
			
			result = rs.updateRoom(title, address, updateImage, deposit, rent, report, roomId);
			
			rs.updateOption(roomId, option);
			rs.updateTag(roomId, roomTag);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		return result;
	}
	
	@DeleteMapping(value="/room")
	public int deleteRoom(
			@RequestParam(value = "roomId") String roomId) {
		int result = rs.deleteRoom(Integer.parseInt(roomId));
		return result;
	}
	
	@GetMapping(value="/myRoom")
	public Integer getMyRoom(
			@RequestParam(value = "id") String mem_id
			) {
		Integer myRoom = rs.getMyRoom(mem_id);
		return myRoom;
	}
	
//	@GetMapping(value="/filterList")
//	public List<RoomVO> getFilteringList(HttpServletRequest request) {
//		
//        String option = request.getParameter("options");
//        String minDeposit = request.getParameter("minDeposit");
//        String maxDeposit = request.getParameter("maxDeposit");
//        String minRent = request.getParameter("minRent");
//        String maxRent = request.getParameter("maxRent");
//        
//        System.out.print(option+", "+minDeposit+", "+maxDeposit+", "+minRent+", "+maxRent);
//        
//        List<RoomVO> list=rs.getFilteringList(option, minDeposit, maxDeposit, minRent, maxRent);
//        
//		return list;
//	}
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index(Locale locale, Model model) {

		return "index";
	}
	
}
