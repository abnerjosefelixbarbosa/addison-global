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
public class UserToken {
	private String token;

	public void setUserToken(User user) {
		this.token = user.getUserId();
	}
}