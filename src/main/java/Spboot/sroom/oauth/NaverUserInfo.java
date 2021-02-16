package Spboot.sroom.oauth;

import com.google.gson.JsonElement;

public class NaverUserInfo implements UserInfo{
	
	JsonElement userInfoElement;
	
	
	
	@Override
	public String getAccessTokenApiURL() {
		String accessTokenApiURL="https://openapi.naver.com/v1/nid/me";
		return accessTokenApiURL;
	}

	@Override
	public void setField(JsonElement userInfoElement) {
		this.userInfoElement=userInfoElement;
		
	}
	@Override
	public String getId() {
		String id=userInfoElement.getAsJsonObject().get("response").getAsJsonObject().get("id").getAsString();
		return id;
	}

	@Override
	public String getName() {
		String name=userInfoElement.getAsJsonObject().get("response").getAsJsonObject().get("name").getAsString();
		return name;
	}

	@Override
	public int getAge() {
		int age = Integer.parseInt(userInfoElement.getAsJsonObject().get("response").getAsJsonObject().get("birthyear").getAsString());
		return age;
	}

	@Override
	public char getGender() {
		char gender='A';
		if(userInfoElement.getAsJsonObject().get("response").getAsJsonObject().get("gender").getAsString()!=null) {
			gender=userInfoElement.getAsJsonObject().get("response").getAsJsonObject().get("gender").getAsString().toLowerCase().charAt(0);
		}
		return gender;
	}

	@Override
	public String getImage() {
		String image=userInfoElement.getAsJsonObject().get("response").getAsJsonObject().get("profile_image").getAsString();
		return image;
	}

}
