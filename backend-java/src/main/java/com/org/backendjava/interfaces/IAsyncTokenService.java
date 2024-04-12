package com.org.backendjava.interfaces;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Future;

import com.org.backendjava.dtos.Credentials;
import com.org.backendjava.dtos.User;
import com.org.backendjava.dtos.UserToken;
import com.org.backendjava.exceptions.NotImplementedException;

public interface IAsyncTokenService {
	CompletableFuture<User> authenticate(Credentials credentials);

	CompletableFuture<UserToken> requestToken(User user);

	default Future<UserToken> issueToken(Credentials credentials) {
		throw new NotImplementedException();
	}
}