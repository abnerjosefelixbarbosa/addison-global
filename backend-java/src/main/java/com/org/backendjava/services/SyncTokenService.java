package com.org.backendjava.services;

import org.springframework.stereotype.Service;

import com.org.backendjava.entities.Credentials;
import com.org.backendjava.entities.User;
import com.org.backendjava.entities.UserToken;
import com.org.backendjava.interfaces.ISyncTokenService;

@Service
public class SyncTokenService implements ISyncTokenService 
{
	public User authenticate(Credentials credentials) 
	{
		return null;
	}

	public UserToken requestToken(User user) 
	{
		return null;
	}
}