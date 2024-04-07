package com.org.backendjava.services;

import java.util.concurrent.CompletableFuture;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.org.backendjava.dtos.requests.CredentialsRequest;
import com.org.backendjava.dtos.requests.UserRequest;
import com.org.backendjava.dtos.responses.UserResponse;
import com.org.backendjava.dtos.responses.UserTokenResponse;
import com.org.backendjava.interfaces.IAsyncTokenService;

@Service
public class AsyncTokenService implements IAsyncTokenService
{
	public CompletableFuture<UserResponse> authenticate(CredentialsRequest credentials)
	{
		return null;
	}

	public CompletableFuture<UserTokenResponse> requestToken(UserRequest user) 
	{
		return null;
	}

	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException
	{
		return null;
	}
}
