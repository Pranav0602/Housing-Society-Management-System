package com.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.BuildingDao;
import com.app.model.Building;

@Service
public class BuildingServiceImpl implements BuildingService{
	
	@Autowired
	private BuildingDao BuildingRepo;
	@Override
	public List<Building> getBuildinglist() {
		// TODO Auto-generated method stub
		return BuildingRepo.findAll();
		
	}

	@Override
	public void addBuilding(Building building) {
		// TODO Auto-generated method stub
		BuildingRepo.save(building);
	}

	@Override
	public Building getBuilding(int id) {
		// TODO Auto-generated method stub
		Optional<Building> res = BuildingRepo.findById(id);
		Building bldg = null;
		if(res.isPresent()) {
			bldg = res.get();
		}else {
			throw new RuntimeException("Did not find the Building id "+id);
			}
		return bldg;
	}

	@Override
	public void deleteBuilding(int id) {
		// TODO Auto-generated method stub
		BuildingRepo.deleteById(id);
	}

}
