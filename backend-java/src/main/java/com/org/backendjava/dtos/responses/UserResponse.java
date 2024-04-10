package com.org.backendjava.dtos.responses;

import com.org.backendjava.entities.User;

public class UserResponse {
	private String userId;
	
	public UserResponse() {
		
	}
	
	public UserResponse(String userId) {
		this.userId = userId;
	}

	public void setUserResponse(User user) {
		this.userId = user.getName();
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
}