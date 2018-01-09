package com.curdsample.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.curdsample.dao.CityDao;
import com.curdsample.models.Citys;
import com.curdsample.repository.CityRepository;

@Repository
@Transactional
public class CityDaoImpl implements CityDao {

	@Autowired
	CityRepository cityRepository;

	@Override
	public void saveCity(Citys citys) {
		cityRepository.save(citys);
	}

}
