package com.org.backendjava.services;

import org.springframework.stereotype.Service;

@Service
public class TokenService 
{
	/*
	private static final String SECRET = "1";
	
	public String generateToken(User user) 
	{
		try
		{
            Algorithm algorithm = Algorithm.HMAC256(SECRET);
            String token = JWT.create()
                    .withIssuer("auth-api")
                    .withSubject(user.getName())
                    .withExpiresAt(genExpirationDate())
                    .sign(algorithm);
            
            return token;
        } catch (Exception exception)
		{
            throw new RuntimeException("Error while generating token", exception);
        }
	}

	public String validateToken(String token) 
	{
		try 
		{
            Algorithm algorithm = Algorithm.HMAC256(SECRET);
            return JWT.require(algorithm)
                    .withIssuer("auth-api")
                    .build()
                    .verify(token)
                    .getSubject();
        } catch (Exception exception)
		{
        	throw new RuntimeException("Error while generating token", exception);
        }
	}

	private Instant genExpirationDate()
	{
		return LocalDateTime.now().plusHours(2).toInstant(ZoneOffset.of("-03:00"));
	}
	*/
}
