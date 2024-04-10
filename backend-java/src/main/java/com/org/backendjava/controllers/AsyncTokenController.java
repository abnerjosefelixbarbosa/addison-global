package com.org.backendjava.controllers;

import java.util.concurrent.CompletableFuture;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.org.backendjava.dtos.requests.CredentialsRequest;
import com.org.backendjava.dtos.requests.UserRequest;
import com.org.backendjava.dtos.responses.UserResponse;
import com.org.backendjava.dtos.responses.UserTokenResponse;
import com.org.backendjava.interfaces.IAsyncTokenService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/async-token")
public class AsyncTokenController {
	@Autowired
    private IAsyncTokenService service;
	
	@PostMapping("/authenticate")
	public ResponseEntity<CompletableFuture<UserResponse>> authenticate(@Valid @RequestBody CredentialsRequest request) {
		CompletableFuture<UserResponse> response = service.authenticate(request);
		return ResponseEntity.status(200).body(response);
	}

	@PostMapping("/request-token")
	public ResponseEntity<CompletableFuture<UserTokenResponse>> requestToken(@Valid @RequestBody UserRequest request) {
		CompletableFuture<UserTokenResponse> response = service.requestToken(request);
		return ResponseEntity.status(200).body(response);
	}
}