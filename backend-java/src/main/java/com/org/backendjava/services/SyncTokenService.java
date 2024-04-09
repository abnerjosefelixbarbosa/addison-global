package com.org.backendjava.services;

import org.springframework.stereotype.Service;

import com.org.backendjava.dtos.requests.CredentialsRequest;
import com.org.backendjava.dtos.requests.UserRequest;
import com.org.backendjava.dtos.responses.UserResponse;
import com.org.backendjava.dtos.responses.UserTokenResponse;
import com.org.backendjava.interfaces.ISyncTokenService;

@Service
public class SyncTokenService implements ISyncTokenService 
{
	public UserResponse authenticate(CredentialsRequest request) 
	{
		threadExcution();
		return new UserResponse();
	}

	public UserTokenResponse requestToken(UserRequest user)
	{
		return new UserTokenResponse();
	}
	
	private void threadExcution() 
	{
		new Thread() 
		{
			public void run() 
			{
				try
				{
					Thread.sleep(5000);
				} catch (Exception e)
				{
					throw new RuntimeException(e.getMessage());
				}
			}
		}.start();
	}
}