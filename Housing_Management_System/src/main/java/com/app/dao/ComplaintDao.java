package com.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.model.Complaint;

@Repository
public interface ComplaintDao extends JpaRepository<Complaint,Integer>{

}
