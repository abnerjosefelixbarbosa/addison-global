package com.org.backendjava.services;

import java.util.concurrent.CompletableFuture;

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

	public CompletableFuture<User> authenticate(Credentials request) {
		return CompletableFuture.completedFuture(null);
	}

	public CompletableFuture<UserToken> requestToken(User request) {
		return CompletableFuture.completedFuture(null);
	}
	
	public void run() {
		try {
		     sleep(5000);
		} catch (Exception e) {
			throw new RuntimeException(e.getMessage());
		}
	}
}