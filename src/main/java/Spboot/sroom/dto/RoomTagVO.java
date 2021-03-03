package Spboot.sroom.dto;

import lombok.Data;

@Data
public class RoomTagVO {
	private int room_id;
	private String tag_content;
	public int getRoom_id() {
		return room_id;
	}
	public void setRoom_id(int room_id) {
		this.room_id = room_id;
	}
	public String getTag_content() {
		return tag_content;
	}
	public void setTag_content(String tag_content) {
		this.tag_content = tag_content;
	}
}
