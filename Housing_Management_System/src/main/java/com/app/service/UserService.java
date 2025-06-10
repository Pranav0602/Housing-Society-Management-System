package com.app.service;

import java.util.List;

import com.app.model.User;

public interface UserService {
	
	public void addUser(User user);
	public List<User> getUserlist();
	public User getUser(int id);
	public void deleteUser(int id);
}
