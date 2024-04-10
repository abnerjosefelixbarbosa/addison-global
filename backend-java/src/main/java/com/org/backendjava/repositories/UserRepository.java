package com.org.backendjava.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.org.backendjava.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, String> {
	Optional<User> findByName(String name);

	boolean existsByName(String userName);
}