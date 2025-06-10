package com.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.model.Visitor;

@Repository
public interface VisitorDao extends JpaRepository<Visitor,Integer>{

}
