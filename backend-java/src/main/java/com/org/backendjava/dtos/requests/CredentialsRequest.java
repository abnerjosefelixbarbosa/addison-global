package com.org.backendjava.dtos.requests;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

public class CredentialsRequest {
	@NotNull
	@NotEmpty
	private String userName;
	@NotNull
	@NotEmpty
    private String password;
	
	public CredentialsRequest() {
		
	}
	
	public CredentialsRequest(String userName, String password) {
		this.userName = userName;
		this.password = password;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}