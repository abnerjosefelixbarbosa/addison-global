package com.org.backendjava.controllers;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.org.backendjava.dtos.Credentials;
import com.org.backendjava.dtos.User;

@SpringBootTest
@ActiveProfiles
@AutoConfigureMockMvc
public class AsyncTokenControllerTest {
	@Autowired
	private MockMvc mvc;
	@Autowired
	private ObjectMapper mapper;
	
	@Test
	@Disabled
	public void shouldAuthenticateAndReturnStatus200() throws Exception {
		Credentials credentials = new Credentials("Username", "password");
		HttpHeaders httpHeaders = new HttpHeaders();
		
		String object = mapper.writeValueAsString(credentials);
	
		mvc.perform(post("/api/async-token/authenticate")
				.contentType(MediaType.APPLICATION_JSON)
				.headers(httpHeaders)
				.content(object))
		.andExpect(MockMvcResultMatchers.status().isOk())
		.andDo(print());
	}
	
	@Test
	@Disabled
	public void shouldRequestTokenAndReturnStatus200 () throws Exception {
		User user = new User("Username");
        HttpHeaders httpHeaders = new HttpHeaders();
		
		String object = mapper.writeValueAsString(user);
		
		mvc.perform(post("/api/async-token/request-token")
				.contentType(MediaType.APPLICATION_JSON)
				.headers(httpHeaders)
				.content(object))
		.andExpect(MockMvcResultMatchers.status().isOk())
		.andDo(print());
	}
}
