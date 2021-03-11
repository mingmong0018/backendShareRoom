package Spboot.sroom.oauth;

import com.google.gson.JsonElement;

public interface UserInfo {
	public String getEmail();
	public String getAccessTokenApiURL();
	public String getId();
	public String getName();
	public int getAge();
	public char getGender();
	public String getImage();
	public void setField(JsonElement userInfoElement);
	
}
