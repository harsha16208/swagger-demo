package com.harsha.swaggerdemo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.harsha.swaggerdemo.models.User;
import com.harsha.swaggerdemo.repo.UserRepository;

@Service
public class UserService {
	
	@Autowired
	UserRepository userRepository;

	public User getUser(int id) {
		Optional<User> user = userRepository.findById(id);
		return user.isPresent() ? user.get() : null;
	}
	
	public List<User> getAllUsers(){
		List<User> users = (List<User>) userRepository.findAll();
		return users;
	}
	
	
	public User saveUser(User user) {
		userRepository.save(user);
		return user;
	}

}
