package com.bronson.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "user")
public class User {

	 @Transient
	    public static final String SEQUENCE_NAME = "users_sequence";
	@Id
	private long id;
	private String username;
}
