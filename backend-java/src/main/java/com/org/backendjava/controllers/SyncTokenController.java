package com.org.backendjava.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.org.backendjava.dtos.requests.CredentialsRequest;
import com.org.backendjava.dtos.requests.UserRequest;
import com.org.backendjava.dtos.responses.UserResponse;
import com.org.backendjava.dtos.responses.UserTokenResponse;
import com.org.backendjava.interfaces.ISyncTokenService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/sync-token")
public class SyncTokenController
{
	@Autowired
	private ISyncTokenService service;
	
	@PostMapping("/authenticate")
	public UserResponse authenticate(@RequestBody @Valid CredentialsRequest request) 
	{
		System.out.println(request.getUserName());
		return service.authenticate(request);
	}

	@PostMapping("/request-token")
	public UserTokenResponse requestToken(@RequestBody @Valid UserRequest request)
	{
		return service.requestToken(request);
	}
}
