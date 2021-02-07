package Spboot.sroom.dto;

import java.sql.Timestamp;

import lombok.Data;

@Data
public class MemberVO {
	String mem_id;
	String mem_email;	
	String mem_name;	
	int mem_age;
	String mem_nickname;
	String mem_image;		
	char mem_gender;
	String mem_confirm;
	Timestamp mem_indate;
	public String getMem_id() {
		return mem_id;
	}
	public void setMem_id(String mem_id) {
		this.mem_id = mem_id;
	}
	public String getMem_email() {
		return mem_email;
	}
	public void setMem_email(String mem_email) {
		this.mem_email = mem_email;
	}
	public String getMem_name() {
		return mem_name;
	}
	public void setMem_name(String mem_name) {
		this.mem_name = mem_name;
	}
	public int getMem_age() {
		return mem_age;
	}
	public void setMem_age(int mem_age) {
		this.mem_age = mem_age;
	}
	public String getMem_nickname() {
		return mem_nickname;
	}
	public void setMem_nickname(String mem_nickname) {
		this.mem_nickname = mem_nickname;
	}
	public String getMem_image() {
		return mem_image;
	}
	public void setMem_image(String mem_image) {
		this.mem_image = mem_image;
	}
	public char getMem_gender() {
		return mem_gender;
	}
	public void setMem_gender(char mem_gender) {
		this.mem_gender = mem_gender;
	}
	public String getMem_confirm() {
		return mem_confirm;
	}
	public void setMem_confirm(String mem_confirm) {
		this.mem_confirm = mem_confirm;
	}
	public Timestamp getMem_indate() {
		return mem_indate;
	}
	public void setMem_indate(Timestamp mem_indate) {
		this.mem_indate = mem_indate;
	}
	
	
	
	
	

}
