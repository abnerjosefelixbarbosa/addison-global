package com.org.backendjava.dtos.responses;

import java.util.Date;

import com.org.backendjava.entities.User;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserResponse {
	private String userId;
	
	public UserResponse(User response) {
		Date date = new Date();
		this.userId = "" + response.getName() + "_" + date;
	}
}