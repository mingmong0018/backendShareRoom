package Spboot.sroom.dto;

import lombok.Data;

@Data
public class BestTagVO {
   private String tag_content;
   private String cnt;
	public String getTag_content() {
		return tag_content;
	}
	public void setTag_content(String tag_content) {
		this.tag_content = tag_content;
	}
	public String getCnt() {
		return cnt;
	}
	public void setCnt(String cnt) {
		this.cnt = cnt;
	}
   
}


