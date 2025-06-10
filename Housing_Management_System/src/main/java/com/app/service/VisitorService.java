package com.app.service;

import java.util.List;

import com.app.model.Visitor;

public interface VisitorService {
	
public List<Visitor> getVisitorlist();
	
	public void addVisitorByname(String name);
	
	public Visitor getVisitor(int id);
	
	public void deleteVisitor(int id);
}
