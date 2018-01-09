package com.curdsample.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.curdsample.dao.StateDao;
import com.curdsample.models.States;
import com.curdsample.repository.StateRepository;

@Repository
@Transactional
public class StateDaoImpl implements StateDao {

	@Autowired
	StateRepository stateRepository;

	@Override
	public void saveState(States states) {
		stateRepository.save(states);
	}

}
