package com.org.backendjava.services;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.org.backendjava.interfaces.ISimpleAsyncTokenService;

@Service
public class SimpleAsyncTokenService implements ISimpleAsyncTokenService
{
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException 
	{
		return null;
	}
}