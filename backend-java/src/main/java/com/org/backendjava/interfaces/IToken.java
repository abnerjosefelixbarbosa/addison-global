package com.org.backendjava.interfaces;

import com.org.backendjava.entities.User;

public interface IToken {
    String generateToken(User user);
	String validateToken(String token);
}