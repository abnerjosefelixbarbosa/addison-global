package com.org.backendjava.interfaces;

import com.org.backendjava.entities.User;

public interface IToken {
	public String generateToken(User user);
	public String validateToken(String token);
}
