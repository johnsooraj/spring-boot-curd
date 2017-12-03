package com.curdsample.services;

import com.curdsample.models.User;

public interface UserService {

	void save(User user);

	User findByUsername(String username);

}
