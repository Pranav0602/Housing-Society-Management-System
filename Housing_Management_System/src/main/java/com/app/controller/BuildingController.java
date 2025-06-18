package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.app.model.Building;

import com.app.service.BuildingService;

@RestController
@RequestMapping("/api/buildings")
public class BuildingController {
	
	@Autowired
	private BuildingService buildingservice;
	
	@GetMapping
	public ResponseEntity<List<Building>> getAllBuildings(){
		List<Building> buildings = buildingservice.getBuildinglist();
        return new ResponseEntity<>(buildings, HttpStatus.OK);
	}
	@GetMapping("/{id}")
	public ResponseEntity<Building> getBuildingById(@PathVariable Integer id){
		Building building = buildingservice.getBuilding(id);
		return new ResponseEntity<>(building, HttpStatus.OK);
	}
	@PostMapping()
	public ResponseEntity<Building> createBuilding(@RequestBody Building building) {
        buildingservice.addBuilding(building);
        return new ResponseEntity<>(building, HttpStatus.CREATED);
    }
	
}
