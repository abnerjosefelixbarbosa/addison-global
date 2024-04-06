package com.org.backendjava.services;

import java.util.concurrent.CompletableFuture;

import org.springframework.stereotype.Service;

import com.org.backendjava.entities.Credentials;
import com.org.backendjava.entities.User;
import com.org.backendjava.entities.UserToken;
import com.org.backendjava.interfaces.IAsyncTokenService;

@Service
public class AsyncTokenService implements IAsyncTokenService
{
	public CompletableFuture<User> authenticate(Credentials credentials)
	{
		return null;
	}

	public CompletableFuture<UserToken> requestToken(User user) 
	{
		return null;
	}
}
