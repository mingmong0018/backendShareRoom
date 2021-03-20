package Spboot.sroom.dto;

import java.sql.Timestamp;

import lombok.Data;

@Data
public class KeywordVO {
	private int keywordId; 
	private String memId; 
	private String keywordContent; 
	private Timestamp keywordIndate;
	public int getKeywordId() {
		return keywordId;
	}
	public void setKeywordId(int keywordId) {
		this.keywordId = keywordId;
	}
	public String getMemId() {
		return memId;
	}
	public void setMemId(String memId) {
		this.memId = memId;
	}
	public String getKeywordContent() {
		return keywordContent;
	}
	public void setKeywordContent(String keywordContent) {
		this.keywordContent = keywordContent;
	}
	public Timestamp getKeywordIndate() {
		return keywordIndate;
	}
	public void setKeywordIndate(Timestamp keywordIndate) {
		this.keywordIndate = keywordIndate;
	}
	
}
