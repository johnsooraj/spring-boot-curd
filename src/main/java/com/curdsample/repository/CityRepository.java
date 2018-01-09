package com.curdsample.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.curdsample.models.Citys;

public interface CityRepository extends JpaRepository<Citys, Long> {

}
