package com.app.service;

import java.util.List;

import com.app.model.Building;

public interface BuildingService {
	
	public List<Building> getBuildinglist();
	
	public void addBuilding(Building building);
	
	public Building getBuilding(int id);
	
	public void deleteBuilding(int id);
}
