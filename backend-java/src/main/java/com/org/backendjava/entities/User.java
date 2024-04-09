package com.org.backendjava.entities;

import java.io.Serializable;

import com.org.backendjava.dtos.requests.CredentialsRequest;

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
public class User implements Serializable
{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private String id;
	@Column(nullable = false, unique = true)
	private String name;
	@Column(nullable = false, unique = true)
    private String password;
	
	public User(CredentialsRequest request) {
		this.name = request.getUserName();
		this.password = request.getPassword();
	}
}