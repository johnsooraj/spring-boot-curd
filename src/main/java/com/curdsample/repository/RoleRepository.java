package com.curdsample.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.curdsample.models.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {

}