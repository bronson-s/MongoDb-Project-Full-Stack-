package com.bronson.repository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.bronson.entities.User;
@Repository
public interface UserRepository extends MongoRepository<User, Long> {

	
	public User findById(ObjectId id);
}
