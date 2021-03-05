package Spboot.sroom.oauth;

import com.google.gson.JsonElement;

public class GoogleUserInfo implements UserInfo{
	
	JsonElement userInfoElement;

	@Override
	public String getAccessTokenApiURL() {
		String accessTokenApiURL="https://people.googleapis.com/v1/people/me?personFields=genders%2Cbirthdays%2Cnames%2Cphotos";
		return accessTokenApiURL;
	}



	@Override
	public void setField(JsonElement userInfoElement) {
		this.userInfoElement=userInfoElement;
		
	}
	@Override
	public String getId() {
		String id=userInfoElement.getAsJsonObject().get("names").getAsJsonArray().get(0).getAsJsonObject().get("metadata").getAsJsonObject().get("source").getAsJsonObject().get("id").getAsString();
		return id;
	}

	@Override
	public String getName() {
		String name=userInfoElement.getAsJsonObject().get("names").getAsJsonArray().get(0).getAsJsonObject().get("displayName").getAsString();
		return name;
	}

	@Override
	public int getAge() {
		int age =Integer.parseInt(userInfoElement.getAsJsonObject().get("birthdays").getAsJsonArray().get(0).getAsJsonObject().get("date").getAsJsonObject().get("year").getAsString());
		return age;
	}

	@Override
	public char getGender() {
		char gender='A';
		if(!(userInfoElement.getAsJsonObject().get("genders").getAsJsonArray().get(0).getAsJsonObject().get("value").getAsString().equals("unspecified"))) {
			gender=userInfoElement.getAsJsonObject().get("genders").getAsJsonArray().get(0).getAsJsonObject().get("value").getAsString().charAt(0);
		}
		return gender;
	}

	@Override
	public String getImage() {
		String image=userInfoElement.getAsJsonObject().get("photos").getAsJsonArray().get(0).getAsJsonObject().get("url").getAsString();
		return image;
	}

}
