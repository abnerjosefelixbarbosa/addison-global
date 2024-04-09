package com.org.backendjava.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.org.backendjava.dtos.requests.CredentialsRequest;
import com.org.backendjava.dtos.requests.UserRequest;
import com.org.backendjava.dtos.responses.UserResponse;
import com.org.backendjava.dtos.responses.UserTokenResponse;
import com.org.backendjava.interfaces.ISyncTokenService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/sync-token")
public class SyncTokenController {
	@Autowired
	private ISyncTokenService service;

	@PostMapping("/authenticate")
	public ResponseEntity<UserResponse> authenticate(@RequestBody @Valid CredentialsRequest request) {
		UserResponse response = service.authenticate(request);
		return ResponseEntity.status(200).body(response);
	}

	@PostMapping("/request-token")
	public ResponseEntity<UserTokenResponse> requestToken(@RequestBody @Valid UserRequest request) {
		UserTokenResponse response = service.requestToken(request);
		return ResponseEntity.status(200).body(response);
	}
}
