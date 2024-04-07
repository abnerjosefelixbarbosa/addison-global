package com.org.backendjava.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "user_tb")
public class User implements Serializable, UserDetails
{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private String id;
	@Column(nullable = false, unique = true)
	private String name;
	@Column(nullable = false, unique = true)
    private String password;
	
	public Collection<? extends GrantedAuthority> getAuthorities() 
	{
		return List.of(new SimpleGrantedAuthority(""));
	}
	
	public String getPassword()
	{
		return password;
	}

	
	public String getUsername() 
	{
		return name;
	}
	
	public boolean isAccountNonExpired()
	{
		return true;
	}
	
	public boolean isAccountNonLocked()
	{
		return true;
	}

	public boolean isCredentialsNonExpired() 
	{
		return true;
	}
	
	public boolean isEnabled()
	{
		return true;
	}
}