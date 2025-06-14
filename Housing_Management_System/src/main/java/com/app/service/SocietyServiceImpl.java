package com.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.SocietyDao;
import com.app.model.Flat;
import com.app.model.Society;

@Service
public class SocietyServiceImpl implements SocietyService{
	
	@Autowired
	private SocietyDao societyRepo;
	@Override
	public List<Society> getSocietylist() {
		// TODO Auto-generated method stub
		return societyRepo.findAll();
	}

	@Override
	public void addSociety(Society society) {
		// TODO Auto-generated method stub
		societyRepo.save(society);
	}

	@Override
	public Society getSociety(int id) {
		// TODO Auto-generated method stub
		Optional<Society> res = societyRepo.findById(id);
		Society society = null;
		if(res.isPresent()) {
			society = res.get();
		}else {
			throw new RuntimeException("Did not find Society"+id);
		}
		return society;
	}

	@Override
	public void deleteSociety(int id) {
		// TODO Auto-generated method stub
		societyRepo.deleteById(id);
	}
	
}
