package Spboot.sroom.oauth;

import java.util.Calendar;

import com.google.gson.JsonElement;

public class KakaoUserInfo implements UserInfo{
	
	JsonElement userInfoElement;
	
	@Override
	public String getAccessTokenApiURL() {
		String accessTokenApiURL="https://kapi.kakao.com/v2/user/me?property_keys=[\"properties.nickname\",\"properties.profile_image\",\"kakao_account.gender\",\"kakao_account.age_range\"]";
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
		Calendar cal=Calendar.getInstance();
        int year=cal.get(Calendar.YEAR);
		int age = 0;
		
		if(userInfoElement.getAsJsonObject().get("kakao_account").getAsJsonObject().get("has_age_range").getAsString().equals("true") 
				&&userInfoElement.getAsJsonObject().get("kakao_account").getAsJsonObject().get("age_range_needs_agreement").getAsString().equals("false")) {
			age=year-Integer.parseInt(userInfoElement.getAsJsonObject().get("kakao_account").getAsJsonObject().get("age_range").getAsString().substring(0, 2))+1;
		}
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
