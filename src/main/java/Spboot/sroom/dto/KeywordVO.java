package Spboot.sroom.dto;

import java.sql.Timestamp;

import lombok.Data;

@Data
public class KeywordVO {
	private int keyword_id; 
	private String mem_id; 
	private String keyword_content; 
	private Timestamp keyword_indate; 
}
