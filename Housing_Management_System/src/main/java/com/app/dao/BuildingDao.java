package com.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.model.Building;

@Repository
public interface BuildingDao extends JpaRepository<Building,Integer> {

}
