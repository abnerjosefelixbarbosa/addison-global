package com.org.backendjava.interfaces;

import java.util.concurrent.CompletableFuture;

import com.org.backendjava.dtos.Credentials;
import com.org.backendjava.dtos.User;
import com.org.backendjava.dtos.UserToken;
import com.org.backendjava.exceptions.NotImplementedException;

public interface ISyncTokenService extends ISimpleAsyncTokenService {
	User authenticate(Credentials credentials);

	UserToken requestToken(User user);

	default CompletableFuture<UserToken> issueToken(Credentials credentials) {
		throw new NotImplementedException("token invalid");
	}
}