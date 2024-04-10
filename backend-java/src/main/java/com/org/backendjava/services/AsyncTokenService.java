package com.org.backendjava.services;

import java.util.concurrent.CompletableFuture;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.org.backendjava.dtos.requests.CredentialsRequest;
import com.org.backendjava.dtos.requests.UserRequest;
import com.org.backendjava.dtos.responses.UserResponse;
import com.org.backendjava.dtos.responses.UserTokenResponse;
import com.org.backendjava.entities.User;
import com.org.backendjava.interfaces.IAsyncTokenService;
import com.org.backendjava.repositories.UserRepository;

import jakarta.persistence.EntityNotFoundException;

@Service
public class AsyncTokenService implements IAsyncTokenService {
	@Autowired
	private UserRepository repository;
	
	public CompletableFuture<UserResponse> authenticate(CredentialsRequest request) {
		UserResponse response = new UserResponse();
		User user = new User();
		
		validadeAuthenticate(request);
		user.setUser(request);
		response.setUserResponse(repository.save(user));
		excuteThread();
		
		return CompletableFuture.completedFuture(response);
	}

	public CompletableFuture<UserTokenResponse> requestToken(UserRequest request) {
		User user = findByName(request.getUserId());
		UserTokenResponse response = new UserTokenResponse();

		response.setUserTokenResponseWithDateTime(user);
		excuteThread();
		
		return CompletableFuture.completedFuture(response);
	}
	
	private void validadeAuthenticate(CredentialsRequest request) {
		if (existsByName(request.getUserName())) {
			issueToken(request);
		}
	}
	
	private void excuteThread() {
		Thread thread = new Thread() {
			public void run() {
				try {
					Thread.sleep(5000);
				} catch (Exception e) {
					throw new RuntimeException(e.getMessage());
				}
			}
		};
		
		thread.start();
	}
	
	private User findByName(String userId) {
		return repository.findByName(userId).orElseThrow(() -> new EntityNotFoundException("user id not found"));
	}

	private boolean existsByName(String userName) {
		return repository.existsByName(userName);
	}
}