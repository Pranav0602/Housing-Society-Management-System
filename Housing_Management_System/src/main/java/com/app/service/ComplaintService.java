package com.app.service;

import java.util.List;

import com.app.model.Complaint;

public interface ComplaintService {
	
public List<Complaint> getComplaintlist();
	
	public void addComplaintByname(String name);
	
	public Complaint getComplaint(int id);
	
	public void deleteComplaint(int id);
}
