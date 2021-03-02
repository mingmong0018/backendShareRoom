package Spboot.sroom.dto;

import lombok.Data;

@Data
public class RoomVO {
	private int room_id;
	private String room_title;
	private String room_address;
	private String room_images;
	private int room_deposit;
	private int room_rent;
	private int mem_age;
	private String mem_gender;
	private String mem_confirm;
}
