package com.app.service;

import java.util.List;

import com.app.model.Society;

public interface SocietyService {
	
public List<Society> getSocietylist();
	
	public void addSociety(Society society);
	
	public Society getSociety(int id);
	
	public void deleteSociety(int id);
}
