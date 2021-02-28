package com.bronson.service;

import java.util.List;

import com.bronson.entities.User;

public interface UserServiceInterface {
	List<User> index();
	User create(User user);
}
