package com.org.backendjava.services;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.stereotype.Service;

import com.org.backendjava.dtos.Credentials;
import com.org.backendjava.dtos.User;
import com.org.backendjava.dtos.UserToken;
import com.org.backendjava.interfaces.ISyncTokenService;

@Service
public class SyncTokenService extends Thread implements ISyncTokenService {
	public SyncTokenService() {
		start();
	}

	public User authenticate(Credentials credentials) {
		User user = new User();
		
		validateAuthentication(credentials);
		
		try {
			user.setUser(credentials);
			sleep(5000);
		} catch (Exception e) {
			throw new RuntimeException(e.getMessage());
		}
		
		return user;
	}

	public UserToken requestToken(User user) {
		UserToken token = new UserToken();
		token.setUserToken(user);
		return token;
	}
	
	private void validateAuthentication(Credentials credentials) {
		String rex = "^[A-Z]+$";
		Pattern pattern = Pattern.compile(rex);
		Matcher matcher = pattern.matcher(credentials.getUserName());
		
		if (!matcher.find()) {
			issueToken(credentials);
		}
	}
}