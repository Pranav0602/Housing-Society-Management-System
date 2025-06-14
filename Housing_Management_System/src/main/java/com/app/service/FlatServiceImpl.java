package com.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.FlatDao;
import com.app.model.Flat;

@Service
public class FlatServiceImpl implements FlatService{

	@Autowired
	private FlatDao FlatRepo;
	@Override
	public List<Flat> getFlatlist() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addFlat(Flat flat) {
		// TODO Auto-generated method stub
		FlatRepo.save(flat);
	}

	@Override
	public Flat getFlat(int id) {
		// TODO Auto-generated method stub
		Optional<Flat> res = FlatRepo.findById(id);
		Flat flat = null;
		if(res.isPresent()) {
			flat = res.get();
		}else {
			throw new RuntimeException("Did not find Flat number"+id);
		}
		return flat;
	}

	@Override
	public void deleteFlat(int id) {
		// TODO Auto-generated method stub
		FlatRepo.deleteById(id);
	}
	
}
