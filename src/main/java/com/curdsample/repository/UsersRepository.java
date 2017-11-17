package com.curdsample.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.curdsample.models.Users;

public interface UsersRepository extends JpaRepository<Users, Long> {

}
