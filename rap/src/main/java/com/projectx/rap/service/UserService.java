package com.projectx.rap.service;

import com.projectx.rap.model.User;

public interface UserService {
	public User findUserByEmail(String email);
	public void saveUser(User user);
}