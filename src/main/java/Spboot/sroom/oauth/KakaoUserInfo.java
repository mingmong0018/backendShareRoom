package Spboot.sroom.oauth;

import com.google.gson.JsonElement;

public class KakaoUserInfo implements UserInfo{
	
	JsonElement userInfoElement;
	
	@Override
	public String getAccessTokenApiURL() {
		String accessTokenApiURL="https://kapi.kakao.com/v2/user/me?property_keys=[\"properties.nickname\",\"properties.profile_image\",\"kakao_account.gender\"]";
		return accessTokenApiURL;
	}



	@Override
	public void setField(JsonElement userInfoElement) {
		this.userInfoElement=userInfoElement;
		
	}
	@Override
	public String getId() {
		String id=userInfoElement.getAsJsonObject().get("id").getAsString();
		return id;
	}

	@Override
	public String getName() {
		String name=userInfoElement.getAsJsonObject().get("properties").getAsJsonObject().get("nickname").getAsString();
		return name;
	}

	@Override
	public int getAge() {
		int age = 1000;
		return age;
	}

	@Override
	public char getGender() {
		char gender='A';
		if(userInfoElement.getAsJsonObject().get("kakao_account").getAsJsonObject().get("has_gender").getAsString().equals("true") 
				&&userInfoElement.getAsJsonObject().get("kakao_account").getAsJsonObject().get("gender_needs_agreement").getAsString().equals("false")) {
			gender=userInfoElement.getAsJsonObject().get("kakao_account").getAsJsonObject().get("gender").getAsString().charAt(0);
		}
		return gender;
	}

	@Override
	public String getImage() {
		String image=userInfoElement.getAsJsonObject().get("properties").getAsJsonObject().get("profile_image").getAsString();
		return image;
	}

}
