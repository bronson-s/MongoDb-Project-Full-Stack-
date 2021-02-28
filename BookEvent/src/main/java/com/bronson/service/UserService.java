package com.bronson.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bronson.entities.User;
import com.bronson.repository.UserRepository;

@Service
public class UserService implements UserServiceInterface {
@Autowired
private UserRepository userRepo;

@Override
public List<User> index() {
	
	return userRepo.findAll();
}

@Override
public User create(User user) {
userRepo.insert(user);
	return user;
}


}
