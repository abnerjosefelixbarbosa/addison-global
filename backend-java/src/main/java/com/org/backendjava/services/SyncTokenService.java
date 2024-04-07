package com.org.backendjava.services;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.org.backendjava.dtos.requests.CredentialsRequest;
import com.org.backendjava.dtos.requests.UserRequest;
import com.org.backendjava.dtos.responses.UserResponse;
import com.org.backendjava.dtos.responses.UserTokenResponse;
import com.org.backendjava.interfaces.ISyncTokenService;

@Service
public class SyncTokenService implements ISyncTokenService 
{
	public UserResponse authenticate(CredentialsRequest credentials) 
	{
		return null;
	}

	public UserTokenResponse requestToken(UserRequest user)
	{
		return null;
	}

	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException 
	{
		return null;
	}
}