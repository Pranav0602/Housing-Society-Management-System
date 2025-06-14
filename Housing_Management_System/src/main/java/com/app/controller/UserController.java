package com.app.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.User;
import com.app.service.UserServiceImpl;

@RestController
@RequestMapping("/api")
public class UserController {
	
	@Autowired
	private UserServiceImpl userservice;
	
	List<User> users = new ArrayList<User>();
	
	public UserController(UserServiceImpl userservice) {
		this.userservice = userservice;
	}
	
	@GetMapping("users/{userId}")
	public User getUserbyId(@PathVariable("userId") int id) {
		return users.get(id);
	}


	@GetMapping("/users")
	public List<User> getAllUser(){
		
		return null;
	}
}
