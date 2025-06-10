package com.app.model;

import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name = "buildings")
public class Building {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(nullable = false)
    private String name;
    
    @Column(nullable = false)
    private int totalFloors;
    
    @ManyToOne
    @JoinColumn(name = "society_id", nullable = false)
    private Society society;
    
    @OneToMany(mappedBy = "building")
    private List<Flat> flats;

	public Building() {
		
	}

	public Building(Long id, String name, int totalFloors, Society society, List<Flat> flats) {
		this.id = id;
		this.name = name;
		this.totalFloors = totalFloors;
		this.society = society;
		this.flats = flats;
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

	public int getTotalFloors() {
		return totalFloors;
	}

	public void setTotalFloors(int totalFloors) {
		this.totalFloors = totalFloors;
	}

	public Society getSociety() {
		return society;
	}

	public void setSociety(Society society) {
		this.society = society;
	}

	public List<Flat> getFlats() {
		return flats;
	}

	public void setFlats(List<Flat> flats) {
		this.flats = flats;
	}
    
    
}
