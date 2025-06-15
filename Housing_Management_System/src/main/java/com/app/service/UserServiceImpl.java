package com.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.UserDao;
import com.app.model.User;
import com.app.model.UserRole;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDao UserRepository;
	@Override
	public void addUser(User user) {
		// TODO Auto-generated method stub
		UserRepository.save(user);
	}

	@Override
	public List<User> getUserlist() {
		// TODO Auto-generated method stub
		return UserRepository.findAll();
	}

	@Override
	public User getUser(int id) {
		// TODO Auto-generated method stub
		Optional<User> result= UserRepository.findById(id);
		
		User user = null;
		
		if(result.isPresent())
		{
			user = result.get();
		}
		else
		{
			//we didnt find the employee
			throw new RuntimeException("Did not find employee id = "+id);
		}
		
		return user;
	}

	@Override
	public void deleteUser(int id) {
		// TODO Auto-generated method stub
		UserRepository.deleteById(id);
	}
	public List<User> findBySocietyId(long id){
		return UserRepository.findUsersBySocietyId(id);
	}
	public List<User> findByRole(UserRole role){
		return UserRepository.findUserByRole(role);
	}
}
