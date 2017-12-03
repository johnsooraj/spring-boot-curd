package com.curdsample.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.curdsample.models.User;

public interface UsersRepository extends JpaRepository<User, Long> {
	
	User findByUsername(String username);

}
