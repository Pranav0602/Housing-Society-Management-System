package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.app.model.Society;

import com.app.service.SocietyService;

@RestController
@RequestMapping("/api/societies")
public class SocietyController {
	
	@Autowired
	private SocietyService societyservice;
	
	@GetMapping
	public ResponseEntity<List<Society>> getAllSocieties(){
		 List<Society> societies = societyservice.getSocietylist();
	        return new ResponseEntity<>(societies, HttpStatus.OK);
	}
	@GetMapping("/{id}")
	public ResponseEntity<Society> getSocietyById(@PathVariable Integer id){
		Society society = societyservice.getSociety(id);
		return new ResponseEntity<>(society, HttpStatus.OK);
	}
	@PostMapping
    public ResponseEntity<Society> createSociety(@RequestBody Society society) {
        societyservice.addSociety(society);
        return new ResponseEntity<>(society, HttpStatus.CREATED);
    }
}
