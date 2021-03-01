package com.bronson.service;

import java.util.List;
import java.util.Optional;

import org.bson.types.ObjectId;
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

@Override

public User update(User user, ObjectId pid) {
	User userToUpdate = userRepo.findById(pid);

	if(user != null) {
	if(user.getId() != null) {userToUpdate.setId(user.getId());}
	if(user.getFirstname() != null ) {userToUpdate.setFirstname(user.getFirstname());}
	if(user.getLastname() != null ) {userToUpdate.setFirstname(user.getLastname());}
	if(user.getUsername() != null ) {userToUpdate.setUsername(user.getUsername());}
	if(user.getPassword() != null ) {userToUpdate.setPassword(user.getPassword());}
	userRepo.save(userToUpdate);
	return userToUpdate;
	}
	return null ;
}

@Override
public boolean destroy(ObjectId id) {
	boolean deleted =false;

	User user = userRepo.findById(id);
	if(user != null) {
		userRepo.delete(user);
	 deleted= true;
	}
 return deleted;
}





}
