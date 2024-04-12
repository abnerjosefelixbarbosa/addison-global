package com.org.backendjava.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class User {
	private String userId;
	
	public void setUser(Credentials credentials) {
		this.userId = credentials.getUserName();
	}
}