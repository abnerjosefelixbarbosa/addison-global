package com.org.backendjava.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.org.backendjava.dtos.requests.CredentialsRequest;
import com.org.backendjava.dtos.requests.UserRequest;
import com.org.backendjava.dtos.responses.UserResponse;
import com.org.backendjava.dtos.responses.UserTokenResponse;
import com.org.backendjava.entities.User;
import com.org.backendjava.interfaces.ISyncTokenService;
import com.org.backendjava.repositories.UserRepository;

import jakarta.persistence.EntityNotFoundException;

@Service
public class SyncTokenService implements ISyncTokenService {
	@Autowired
	private UserRepository repository;
	
	public UserResponse authenticate(CredentialsRequest request) {
		UserResponse response = new UserResponse();
		User user = new User(request);
		
		new Thread() {
			public void run() {
				try {
					Thread.sleep(5000);
				} catch (Exception e) {
					throw new RuntimeException(e.getMessage());
				}
			}
		}.start();
		
		response.setUserId(repository.save(user).getName());
		return response;
	}

	public UserTokenResponse requestToken(UserRequest user) {
		User findByName = repository.findByName(user.getUserId()).orElseThrow(() -> new EntityNotFoundException("user id not found"));
		UserTokenResponse response = new UserTokenResponse();
		
		response.setToken(findByName.getName());
		return response;
	}
}