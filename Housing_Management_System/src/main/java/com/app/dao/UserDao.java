package com.app.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.app.model.User;
import com.app.model.UserRole;

@Repository
public interface UserDao extends JpaRepository<User,Integer>{

	@Query("SELECT u FROM User u WHERE u.society.id = :societyId")
    List<User> findUsersBySocietyId(Long societyId);
	
	@Query("SELECT u FROM User u Where u.role = :role")
	List<User> findUserByRole(UserRole role);
}
