package com.harsha.swaggerdemo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.harsha.swaggerdemo.models.User;
import com.harsha.swaggerdemo.service.UserService;

@RestController
@RequestMapping("/api/users")

public class UserRestController {

	@Autowired
	private UserService userService;

	@GetMapping("/{id}")
	public User getUser(@PathVariable int id) {
		return userService.getUser(id);
	}

	@GetMapping("/")
	public List<User> getAllUsers() {
		return userService.getAllUsers();
	}

	@PostMapping("/")
	public User saveUser(@RequestBody User user) {
		return userService.saveUser(user);
	}

}
