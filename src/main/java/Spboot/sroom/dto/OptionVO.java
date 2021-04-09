package Spboot.sroom.dto;

import lombok.Data;

@Data
public class OptionVO {
	private int option_id;
	private String option_group;
	private String option_name;
	public int getOption_id() {
		return option_id;
	}
	public void setOption_id(int option_id) {
		this.option_id = option_id;
	}
	public String getOption_group() {
		return option_group;
	}
	public void setOption_group(String option_group) {
		this.option_group = option_group;
	}
	public String getOption_name() {
		return option_name;
	}
	public void setOption_name(String option_name) {
		this.option_name = option_name;
	}
	
}
