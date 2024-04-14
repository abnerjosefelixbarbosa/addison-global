package com.org.backendjava.interfaces;

import java.util.concurrent.CompletableFuture;

import com.org.backendjava.dtos.Credentials;
import com.org.backendjava.dtos.UserToken;
import com.org.backendjava.exceptions.NotImplementedException;

public interface ISimpleAsyncTokenService {
	default CompletableFuture<UserToken> issueToken(Credentials credentials) {
		throw new NotImplementedException("token invalid");
	}
}
