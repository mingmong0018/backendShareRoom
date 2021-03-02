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
	public int getRoom_id() {
		return room_id;
	}
	public void setRoom_id(int room_id) {
		this.room_id = room_id;
	}
	public String getRoom_title() {
		return room_title;
	}
	public void setRoom_title(String room_title) {
		this.room_title = room_title;
	}
	public String getRoom_address() {
		return room_address;
	}
	public void setRoom_address(String room_address) {
		this.room_address = room_address;
	}
	public String getRoom_images() {
		return room_images;
	}
	public void setRoom_images(String room_images) {
		this.room_images = room_images;
	}
	public int getRoom_deposit() {
		return room_deposit;
	}
	public void setRoom_deposit(int room_deposit) {
		this.room_deposit = room_deposit;
	}
	public int getRoom_rent() {
		return room_rent;
	}
	public void setRoom_rent(int room_rent) {
		this.room_rent = room_rent;
	}
	
}
