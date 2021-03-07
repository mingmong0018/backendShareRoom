package Spboot.sroom.dto;

import java.sql.Timestamp;

import lombok.Data;

@Data
public class WishListVO {
	private int wish_id;	
	private String mem_id;
	private int room_id;
	private Timestamp wish_indate;
	public int getWish_id() {
		return wish_id;
	}
	public void setWish_id(int wish_id) {
		this.wish_id = wish_id;
	}
	public String getMem_id() {
		return mem_id;
	}
	public void setMem_id(String mem_id) {
		this.mem_id = mem_id;
	}
	public int getRoom_id() {
		return room_id;
	}
	public void setRoom_id(int room_id) {
		this.room_id = room_id;
	}
	public Timestamp getWish_indate() {
		return wish_indate;
	}
	public void setWish_indate(Timestamp wish_indate) {
		this.wish_indate = wish_indate;
	}
}
