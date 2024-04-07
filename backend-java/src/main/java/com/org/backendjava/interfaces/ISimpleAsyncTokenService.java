package com.org.backendjava.interfaces;

import java.util.concurrent.CompletableFuture;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.org.backendjava.dtos.requests.CredentialsRequest;
import com.org.backendjava.dtos.responses.UserTokenResponse;
import com.org.backendjava.exceptions.NotImplementedException;

public interface ISimpleAsyncTokenService extends UserDetailsService
{
	default CompletableFuture<UserTokenResponse> issueToken(CredentialsRequest credentials) 
	{
	    throw new NotImplementedException();
	}
}
