package com.curdsample.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.curdsample.models.States;

public interface StateRepository extends JpaRepository<States, Long> {

}
