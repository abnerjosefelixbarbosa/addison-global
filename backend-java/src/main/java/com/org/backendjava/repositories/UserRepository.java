package com.org.backendjava.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.org.backendjava.entities.User;

public interface UserRepository extends JpaRepository<User, String> 
{
	Optional<User> findByName(Object name);
}