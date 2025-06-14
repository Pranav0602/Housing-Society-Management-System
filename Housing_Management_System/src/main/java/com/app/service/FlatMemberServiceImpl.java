package com.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.app.dao.FlatMemberDao;

import com.app.model.FlatMember;

public class FlatMemberServiceImpl implements FlatMemberService{
	
	@Autowired
	private FlatMemberDao flatmemberRepo;
	@Override
	public List<FlatMember> getFlatMemberlist() {
		// TODO Auto-generated method stub
		return flatmemberRepo.findAll();
	}

	@Override
	public void addFlatMember(FlatMember member) {
		// TODO Auto-generated method stub
		flatmemberRepo.save(member);
	}

	@Override
	public FlatMember getFlatMember(int id) {
		// TODO Auto-generated method stub
		Optional<FlatMember> res = flatmemberRepo.findById(id);
		FlatMember flatmember = null;
		if(res.isPresent()) {
			flatmember = res.get();
		}else {
			throw new RuntimeException("Did not find Flat number"+id);
		}
		return flatmember;
	
	}

	@Override
	public void deleteFlatMember(int id) {
		// TODO Auto-generated method stub
		flatmemberRepo.deleteById(id);
	}

}
