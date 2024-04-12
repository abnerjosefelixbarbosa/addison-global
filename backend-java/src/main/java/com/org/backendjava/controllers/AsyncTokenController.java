package com.org.backendjava.controllers;

import java.util.concurrent.CompletableFuture;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.org.backendjava.dtos.Credentials;
import com.org.backendjava.dtos.User;
import com.org.backendjava.dtos.UserToken;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/async-token")
public class AsyncTokenController {
	//@Autowired
    //private IAsyncTokenService service;
	
	@PostMapping("/authenticate")
	public ResponseEntity<CompletableFuture<User>> authenticate(@Valid @RequestBody Credentials request) {
		return ResponseEntity.status(200).body(null);
	}

	@PostMapping("/request-token")
	public ResponseEntity<CompletableFuture<UserToken>> requestToken(@Valid @RequestBody User request) {
		return ResponseEntity.status(200).body(null);
	}
}