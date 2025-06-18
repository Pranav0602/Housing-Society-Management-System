package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


import com.app.model.FlatMember;

import com.app.service.FlatMemberService;

public class FlatMemberController {
	
	@Autowired
	private FlatMemberService flatmemberservice;
	
	@GetMapping
	public ResponseEntity<List<FlatMember>> getAllFlatMembers(){
		List<FlatMember> flatmembers = flatmemberservice.getFlatMemberlist();
		return new ResponseEntity<>(flatmembers,HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<FlatMember> getFlatMemberById(@PathVariable Integer id){
		FlatMember flatmember = flatmemberservice.getFlatMember(id);
		return new ResponseEntity<>(flatmember, HttpStatus.OK);
	}
	@PostMapping()
	public ResponseEntity<FlatMember> createFlatMember(@RequestBody FlatMember flatm) {
        flatmemberservice.addFlatMember(flatm);
        return new ResponseEntity<>(flatm, HttpStatus.CREATED);
    }
}
