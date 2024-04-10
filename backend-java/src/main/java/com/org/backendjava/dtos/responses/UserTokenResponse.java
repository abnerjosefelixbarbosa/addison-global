package com.org.backendjava.dtos.responses;

import java.util.Date;

import com.org.backendjava.entities.User;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserTokenResponse {
	private String token;
	
	public void setUserTokenResponse(User user) {
		this.token = user.getName();
	}
	
	public void setUserTokenResponseWithDateTime(User user) {
		Date date = new Date();
		this.token = user.getName() + "_" + date.toString();
	}
}
