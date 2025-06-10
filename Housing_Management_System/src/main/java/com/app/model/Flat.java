package com.app.model;

import jakarta.persistence.*;

@Entity
@Table(name = "flats")
public class Flat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(nullable = false)
    private String flatNumber;
    
    @Column(nullable = false)
    private int floorNumber;
    
    @ManyToOne
    @JoinColumn(name = "building_id", nullable = false)
    private Building building;
    
    @OneToOne(mappedBy = "flat")
    private FlatMember member;

	public Flat() {
	}

	public Flat(Long id, String flatNumber, int floorNumber, Building building, FlatMember member) {
		super();
		this.id = id;
		this.flatNumber = flatNumber;
		this.floorNumber = floorNumber;
		this.building = building;
		this.member = member;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFlatNumber() {
		return flatNumber;
	}

	public void setFlatNumber(String flatNumber) {
		this.flatNumber = flatNumber;
	}

	public int getFloorNumber() {
		return floorNumber;
	}

	public void setFloorNumber(int floorNumber) {
		this.floorNumber = floorNumber;
	}

	public Building getBuilding() {
		return building;
	}

	public void setBuilding(Building building) {
		this.building = building;
	}

	public FlatMember getMember() {
		return member;
	}

	public void setMember(FlatMember member) {
		this.member = member;
	}
    
	
    
}
