package com.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.model.Expense;

@Repository
public interface ExpenseDao extends JpaRepository<Expense,Integer> {

}
