package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import com.app.model.Visitor;
import com.app.service.VisitorService;

@RestController
@RequestMapping("/api/visitors")
public class VisitorController {
	
	@Autowired
	private VisitorService visitorservice;
	@GetMapping
    public ResponseEntity<List<Visitor>> getAllVisitors() {
        List<Visitor> visitors = visitorservice.getVisitorlist();
        return new ResponseEntity<>(visitors, HttpStatus.OK);
    }
	 @GetMapping("/{id}")
	    public ResponseEntity<Visitor> getVisitorById(@PathVariable Integer id) {
	        Visitor visitor = visitorservice.getVisitor(id);
	        return new ResponseEntity<>(visitor, HttpStatus.OK);
	    }
	 @PostMapping
	    public ResponseEntity<Visitor> createVisitor(@RequestBody Visitor visitor) {
	        visitorservice.addVisitor(visitor);
	        return new ResponseEntity<>(visitor, HttpStatus.CREATED);
	    }
	 

}
