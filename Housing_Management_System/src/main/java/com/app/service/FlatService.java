package com.app.service;

import java.util.List;

import com.app.model.Flat;

public interface FlatService {
	
public List<Flat> getFlatlist();
	
	public void addFlat(Flat flat);
	
	public Flat getFlat(int id);
	
	public void deleteFlat(int id);
}
