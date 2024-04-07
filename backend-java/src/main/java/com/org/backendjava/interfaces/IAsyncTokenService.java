package com.org.backendjava.interfaces;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Future;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.org.backendjava.dtos.requests.CredentialsRequest;
import com.org.backendjava.dtos.requests.UserRequest;
import com.org.backendjava.dtos.responses.UserResponse;
import com.org.backendjava.dtos.responses.UserTokenResponse;
import com.org.backendjava.exceptions.NotImplementedException;

public interface IAsyncTokenService extends UserDetailsService
{
	 CompletableFuture<UserResponse> authenticate(CredentialsRequest credentials);
     CompletableFuture<UserTokenResponse> requestToken(UserRequest user);
	 default Future<UserTokenResponse> issueToken(CredentialsRequest credentials) 
	 {
	      throw new NotImplementedException();
	 }
}