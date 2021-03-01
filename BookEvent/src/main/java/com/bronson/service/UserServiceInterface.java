package com.bronson.service;

import java.util.List;

import org.bson.types.ObjectId;

import com.bronson.entities.User;

public interface UserServiceInterface {
	List<User> index();
	User create(User user);
	User update(User user, ObjectId pid);
	boolean destroy(ObjectId id);
}
