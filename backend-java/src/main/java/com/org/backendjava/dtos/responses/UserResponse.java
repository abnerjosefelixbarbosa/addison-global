package com.org.backendjava.dtos.responses;

import com.org.backendjava.entities.User;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserResponse {
	private String userId;
	
	public void setUserResponse(User user) {
		this.userId = user.getName();
	}
}