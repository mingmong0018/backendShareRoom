package Spboot.sroom.dto;

import java.sql.Timestamp;

import lombok.Data;

@Data
public class KeywordVO {
	private int keyword_id; 
	private String mem_id; 
	private String keyword_content; 
	private Timestamp keyword_indate;
	public int getKeyword_id() {
		return keyword_id;
	}
	public void setKeyword_id(int keyword_id) {
		this.keyword_id = keyword_id;
	}
	public String getMem_id() {
		return mem_id;
	}
	public void setMem_id(String mem_id) {
		this.mem_id = mem_id;
	}
	public String getKeyword_content() {
		return keyword_content;
	}
	public void setKeyword_content(String keyword_content) {
		this.keyword_content = keyword_content;
	}
	public Timestamp getKeyword_indate() {
		return keyword_indate;
	}
	public void setKeyword_indate(Timestamp keyword_indate) {
		this.keyword_indate = keyword_indate;
	} 
}
