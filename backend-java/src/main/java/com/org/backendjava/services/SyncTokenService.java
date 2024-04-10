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
		User user = new User();

		validadeAuthenticate(request);
		user.setUser(request);
		response.setUserResponse(repository.save(user));
		excuteThread();

		return response;
	}

	public UserTokenResponse requestToken(UserRequest request) {
		User user = findByName(request.getUserId());
		UserTokenResponse response = new UserTokenResponse();

		response.setUserTokenResponse(user);
		excuteThread();

		return response;
	}

	private void validadeAuthenticate(CredentialsRequest request) {
		//Pattern pattern = Pattern.compile("[A-Z]");
		//Matcher matcher = pattern.matcher(request.getUserName());
		
		//System.out.println(request.getUserName().matches("[A-Z]"));
	
		//if (request.getUserName().matches("[A-Z]") == false)
			//issueToken(request);
		if (existsByName(request.getUserName())) 
			issueToken(request);
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