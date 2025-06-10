package com.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.model.Society;

@Repository
public interface SocietyDao extends JpaRepository<Society,Integer> {

}
