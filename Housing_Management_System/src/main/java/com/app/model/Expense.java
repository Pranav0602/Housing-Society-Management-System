package com.app.model;

import java.time.LocalDate;

import jakarta.persistence.*;

@Entity
@Table(name = "expenses")
public class Expense {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(nullable = false)
    private String title;
    
    @Column(nullable = false)
    private String description;
    
    @Column(nullable = false)
    private double amount;
    
    @Enumerated(EnumType.STRING)
    private ExpenseCategory category;
    
    @Column(nullable = false)
    private LocalDate expenseDate;
    
    @ManyToOne
    @JoinColumn(name = "society_id", nullable = false)
    private Society society;

	public Expense() {
	}

	public Expense(Long id, String title, String description, double amount, ExpenseCategory category,
			LocalDate expenseDate, Society society) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.amount = amount;
		this.category = category;
		this.expenseDate = expenseDate;
		this.society = society;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public ExpenseCategory getCategory() {
		return category;
	}

	public void setCategory(ExpenseCategory category) {
		this.category = category;
	}

	public LocalDate getExpenseDate() {
		return expenseDate;
	}

	public void setExpenseDate(LocalDate expenseDate) {
		this.expenseDate = expenseDate;
	}

	public Society getSociety() {
		return society;
	}

	public void setSociety(Society society) {
		this.society = society;
	}
    
	
    
}


