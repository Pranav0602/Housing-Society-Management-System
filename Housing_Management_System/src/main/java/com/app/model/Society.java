package com.app.model;

import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name = "societies")
public class Society {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(nullable = false)
    private String name;
    
    @Column(nullable = false)
    private String address;
    
    @Column(nullable = false, unique = true)
    private String registrationNumber;
    
    @OneToMany(mappedBy = "society")
    private List<Building> buildings;
    
    @OneToMany(mappedBy = "society")
    private List<User> admins;
    
    @OneToMany(mappedBy = "society")
    private List<Expense> expenses;

	public Society() {
	
	}

	public Society(Long id, String name, String address, String registrationNumber, List<Building> buildings,
			List<User> admins, List<Expense> expenses) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.registrationNumber = registrationNumber;
		this.buildings = buildings;
		this.admins = admins;
		this.expenses = expenses;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getRegistrationNumber() {
		return registrationNumber;
	}

	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}

	public List<Building> getBuildings() {
		return buildings;
	}

	public void setBuildings(List<Building> buildings) {
		this.buildings = buildings;
	}

	public List<User> getAdmins() {
		return admins;
	}

	public void setAdmins(List<User> admins) {
		this.admins = admins;
	}

	public List<Expense> getExpenses() {
		return expenses;
	}

	public void setExpenses(List<Expense> expenses) {
		this.expenses = expenses;
	}
    
	
    
}