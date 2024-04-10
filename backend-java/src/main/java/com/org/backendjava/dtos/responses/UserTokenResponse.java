package com.org.backendjava.dtos.responses;

import java.time.Instant;
import java.util.Date;

import org.hibernate.validator.internal.constraintvalidators.bv.time.futureorpresent.FutureOrPresentValidatorForInstant;

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
		Instant instant = Instant.now();
		this.token = user.getName() + "_" + date.toString();
	}
}
