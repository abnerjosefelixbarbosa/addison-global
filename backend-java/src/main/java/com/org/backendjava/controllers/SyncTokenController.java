package com.org.backendjava.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.org.backendjava.dtos.Credentials;
import com.org.backendjava.dtos.User;
import com.org.backendjava.dtos.UserToken;
import com.org.backendjava.interfaces.ISyncTokenService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/sync-token")
public class SyncTokenController {
	@Autowired
    private ISyncTokenService service;

	@PostMapping("/authenticate")
	public ResponseEntity<User> authenticate(@RequestBody @Valid Credentials credentials) {
		User user = service.authenticate(credentials);
		return ResponseEntity.status(200).body(user);
	}

	@PostMapping("/request-token")
	public ResponseEntity<UserToken> requestToken(@RequestBody @Valid User user) {
		UserToken userToken = service.requestToken(user);
		return ResponseEntity.status(200).body(userToken);
	}
}