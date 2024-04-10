package com.org.backendjava.dtos.requests;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

public class UserRequest {
	@NotNull
	@NotEmpty
	private String userId;
	
	public UserRequest() {	
	}

	public UserRequest(String userId) {
		this.userId = userId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
}