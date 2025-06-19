package com.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.VisitorDao;

import com.app.model.Visitor;

@Service
public class VisitorServiceImpl implements VisitorService{
	
	@Autowired
	private VisitorDao visitRepo;
	@Override
	public List<Visitor> getVisitorlist() {
		// TODO Auto-generated method stub
		return visitRepo.findAll();
	}

	@Override
	public void addVisitor(Visitor visit) {
		// TODO Auto-generated method stub
		visitRepo.save(visit);
	}

	@Override
	public Visitor getVisitor(int id) {
		// TODO Auto-generated method stub
		Optional<Visitor> res = visitRepo.findById(id);
		Visitor visits = null;
		if(res.isPresent()) {
			visits = res.get();
		}else {
			throw new RuntimeException("Did not find Flat number"+id);
		}
		return visits;
		
	}

	@Override
	public void deleteVisitor(int id) {
		// TODO Auto-generated method stub
		visitRepo.deleteById(id);
	}

}
