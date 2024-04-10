package com.org.backendjava.interfaces;

import com.org.backendjava.dtos.requests.CredentialsRequest;
import com.org.backendjava.dtos.requests.UserRequest;
import com.org.backendjava.dtos.responses.UserResponse;
import com.org.backendjava.dtos.responses.UserTokenResponse;
import com.org.backendjava.exceptions.NotImplementedException;

public interface ISyncTokenService {
	UserResponse authenticate(CredentialsRequest credentials);

	UserTokenResponse requestToken(UserRequest user);

	default UserTokenResponse issueToken(CredentialsRequest credentials) {
		throw new NotImplementedException("token invalid");
	}
}