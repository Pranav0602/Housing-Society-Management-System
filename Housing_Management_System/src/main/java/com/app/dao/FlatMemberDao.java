package com.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.model.FlatMember;

@Repository
public interface FlatMemberDao extends JpaRepository<FlatMember,Integer>{

}
