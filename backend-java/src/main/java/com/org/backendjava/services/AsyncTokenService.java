package com.org.backendjava.services;

import java.util.concurrent.CompletableFuture;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.stereotype.Service;

import com.org.backendjava.dtos.Credentials;
import com.org.backendjava.dtos.User;
import com.org.backendjava.dtos.UserToken;
import com.org.backendjava.interfaces.IAsyncTokenService;

@Service
public class AsyncTokenService extends Thread implements IAsyncTokenService {
	public AsyncTokenService() {
		start();
	}

	public CompletableFuture<User> authenticate(Credentials credentials) {
		User user = new User();
		
		String rex = "\\b[A-Z][a-z]*\\b";
		Pattern pattern = Pattern.compile(rex);
		Matcher matcher = pattern.matcher(credentials.getUserName());
		
		if (!matcher.find()) {
			throw new RuntimeException("user name invalid");
		}
		
		try {
			user.setUserWithDate(credentials);
		    sleep(5000);
		} catch (Exception e) {
			throw new RuntimeException(e.getMessage());
		}
		
		return CompletableFuture.completedFuture(user);
	}

	public CompletableFuture<UserToken> requestToken(User user) {
		UserToken token = new UserToken();
		token.setUserTokenWithDate(user);
		return CompletableFuture.completedFuture(token);
	}
}