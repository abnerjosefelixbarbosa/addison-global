package com.org.backendjava.interfaces;

import com.org.backendjava.entities.Credentials;
import com.org.backendjava.entities.User;
import com.org.backendjava.entities.UserToken;
import com.org.backendjava.exceptions.NotImplementedException;

public interface ISyncTokenService 
{
	User authenticate(Credentials credentials);
    UserToken requestToken(User user);
    default UserToken issueToken(Credentials credentials) 
    {
        throw new NotImplementedException(); 
    }
}