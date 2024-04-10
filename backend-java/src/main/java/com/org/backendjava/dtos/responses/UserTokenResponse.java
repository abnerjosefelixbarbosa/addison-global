package com.org.backendjava.dtos.responses;

import java.util.Date;

import com.org.backendjava.entities.User;

public class UserTokenResponse {
	private String token;
	
	public UserTokenResponse() {
		
	}
	
	public UserTokenResponse(String token) {
		this.token = token;
	}

	public void setUserTokenResponse(User user) {
		this.token = user.getName();
	}
	
	public void setUserTokenResponseWithDateTime(User user) {
		Date date = new Date();
		this.token = user.getName() + "_" + date.toString();
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}
}