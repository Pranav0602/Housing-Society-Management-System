package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.app.model.Flat;

import com.app.service.FlatService;

@RestController
@RequestMapping("/api/flats")
public class FlatController {
	
	@Autowired
	private FlatService flatservice;
	
	@GetMapping
	public ResponseEntity<List<Flat>> getAllFlats(){
		 List<Flat> flats = flatservice.getFlatlist();
	        return new ResponseEntity<>(flats, HttpStatus.OK);
	}
	@PostMapping
	public ResponseEntity<Flat> createFlat(@RequestBody Flat flat) {
        flatservice.addFlat(flat);
        return new ResponseEntity<>(flat, HttpStatus.CREATED);
    }
	@GetMapping("/{id}")
	public ResponseEntity<Flat> getFlatById(@PathVariable Integer id){
		Flat flat = flatservice.getFlat(id);
		return new ResponseEntity<>(flat, HttpStatus.OK);
	}
}
