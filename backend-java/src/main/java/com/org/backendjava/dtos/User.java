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
public class User {
	private String userId;
	
	public void setUser(Credentials credentials) {
		this.userId = credentials.getUserName();
	}

	public void setUserWithDate(Credentials credentials) {
		Date date = new Date(System.currentTimeMillis());
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ssz");
		String dateFormatter = format.format(date);
		this.userId = credentials.getUserName() + "_" + dateFormatter;
	}
}