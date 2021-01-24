package Spboot.sroom.dto;

import java.sql.Timestamp;

import lombok.Data;

@Data
public class RoomVO {
	private int room_id;
	private int mem_id;
	private String room_title;
	private String room_address;
	private String room_images;
	private int room_deposit;
	private int room_rent;
	private String room_report;
	private String room_mem_phone;
	private Timestamp room_indate;
}
