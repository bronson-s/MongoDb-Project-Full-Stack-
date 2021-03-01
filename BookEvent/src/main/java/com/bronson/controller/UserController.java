package com.bronson.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bronson.entities.User;
import com.bronson.service.UserService;

@RequestMapping("api")
@RestController
public class UserController {
	@Autowired
	private UserService userSvc;

	@GetMapping("/ping")
	public String ping() {
		return "pong";
	}

	@GetMapping("/user")
	public List<User> findAllUsers() {
		return userSvc.index();
	}

	@PostMapping("/user")

	public User createNewUser(@RequestBody User user, HttpServletResponse response, HttpServletRequest request) {
		user = userSvc.create(user);

		if (user == null) {
			response.setStatus(404);
		} else {
			response.setStatus(201);
			StringBuffer url = request.getRequestURL();
			url.append("/").append(user.getId());
			response.setHeader("Location", url.toString());

		}
		return user;
	}

	@PutMapping("/user/{pid}")
	public User updateUser(@RequestBody User user, @PathVariable ObjectId pid, HttpServletResponse response) {

		user = userSvc.update(user, pid);

		try {
			if (user == null) {

				response.setStatus(404);
			}
		} catch (Exception e) {
	
			response.setStatus(400);
			user = null;
		}
		return user;
	}
	@DeleteMapping("/user/{id}")
	public void deleteTodo(@PathVariable ObjectId id, HttpServletResponse response) {
		try {

			boolean deleted = userSvc.destroy(id);
			if (deleted) {
				response.setStatus(204);
			} else {
				response.setStatus(404);
			}
		} catch (Exception e) {
			// TODO: handle exception
			response.setStatus(400);
		}

	}
}
