package com.app.service;

import java.util.List;

import com.app.model.Expense;

public interface ExpenseService {
	
public List<Expense> getExpenselist();
	
	public void addExpenseByname(String name);
	
	public Expense getExpense(int id);
	
	public void deleteExpense(int id);
}
