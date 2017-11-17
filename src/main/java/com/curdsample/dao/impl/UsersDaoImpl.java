package com.curdsample.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.curdsample.dao.UsersDao;
import com.curdsample.repository.UsersRepository;

@Repository
public class UsersDaoImpl implements UsersDao {

	@Autowired
	UsersRepository usersRepository;
}
