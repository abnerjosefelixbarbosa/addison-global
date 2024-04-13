package com.org.backendjava.dtos;

import java.text.SimpleDateFormat;
import java.util.Date;

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
	
	public void setUserTokenWithDate(User user) {
		Date date = new Date(System.currentTimeMillis());
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ssz");
		String dateFormatter = format.format(date);
		this.token = user.getUserId() + "_" + dateFormatter;
	}
}