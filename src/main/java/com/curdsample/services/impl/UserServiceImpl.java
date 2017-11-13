package com.curdsample.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curdsample.services.UserService;

@Service
public class UserServiceImpl {

	@Autowired
	UserService userService; 
}
