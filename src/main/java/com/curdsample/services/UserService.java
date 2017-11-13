package com.curdsample.services;

import org.springframework.data.jpa.repository.JpaRepository;

import com.curdsample.models.Users;

public interface UserService extends JpaRepository<Users, Long> {

}
