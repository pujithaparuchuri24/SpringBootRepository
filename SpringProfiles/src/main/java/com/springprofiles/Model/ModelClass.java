package com.springprofiles.Model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component(value="model")
//@Profile(value="dev")
public class ModelClass {
     @Value("${spring.profileurl}")
	private String profile;

	public String getProfile() {
		return profile;
	}

	public void setProfile(String profile) {
		this.profile = profile;
	}
	
}
