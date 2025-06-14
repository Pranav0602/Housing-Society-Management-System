package com.app.service;

import java.util.List;

import com.app.model.FlatMember;

public interface FlatMemberService {
	
public List<FlatMember> getFlatMemberlist();
	
	public void addFlatMember(FlatMember member);
	
	public FlatMember getFlatMember(int id);
	
	public void deleteFlatMember(int id);
}
