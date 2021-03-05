package Spboot.sroom.dto;

import java.sql.Timestamp;

import lombok.Data;

@Data
public class RoomDetailVO {
	private int room_id;
	private String mem_id;
	private String room_title;
	private String room_address;
	private String room_images;
	private int room_deposit;
	private int room_rent;
	private String room_report;
	private String room_mem_phone;
	private Timestamp room_indate;
	public int getRoom_id() {
		return room_id;
	}
	public void setRoom_id(int room_id) {
		this.room_id = room_id;
	}
	public String getMem_id() {
		return mem_id;
	}
	public void setMem_id(String mem_id) {
		this.mem_id = mem_id;
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
	public String getRoom_report() {
		return room_report;
	}
	public void setRoom_report(String room_report) {
		this.room_report = room_report;
	}
	public String getRoom_mem_phone() {
		return room_mem_phone;
	}
	public void setRoom_mem_phone(String room_mem_phone) {
		this.room_mem_phone = room_mem_phone;
	}
	public Timestamp getRoom_indate() {
		return room_indate;
	}
	public void setRoom_indate(Timestamp room_indate) {
		this.room_indate = room_indate;
	}
	
}
