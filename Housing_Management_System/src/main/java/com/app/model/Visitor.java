package com.app.model;

import java.time.LocalDateTime;

import jakarta.persistence.*;

@Entity
@Table(name = "visitors")
public class Visitor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(nullable = false)
    private String name;
    
    @Column(nullable = false)
    private String phone;
    
    @Column(nullable = false)
    private String purpose;
    
    @Column(nullable = false)
    private LocalDateTime entryTime;
    
    private LocalDateTime exitTime;
    
    @ManyToOne
    @JoinColumn(name = "flat_id", nullable = false)
    private Flat visitingFlat;

	public Visitor() {
	}

	public Visitor(Long id, String name, String phone, String purpose, LocalDateTime entryTime, LocalDateTime exitTime,
			Flat visitingFlat) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.purpose = purpose;
		this.entryTime = entryTime;
		this.exitTime = exitTime;
		this.visitingFlat = visitingFlat;
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

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPurpose() {
		return purpose;
	}

	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}

	public LocalDateTime getEntryTime() {
		return entryTime;
	}

	public void setEntryTime(LocalDateTime entryTime) {
		this.entryTime = entryTime;
	}

	public LocalDateTime getExitTime() {
		return exitTime;
	}

	public void setExitTime(LocalDateTime exitTime) {
		this.exitTime = exitTime;
	}

	public Flat getVisitingFlat() {
		return visitingFlat;
	}

	public void setVisitingFlat(Flat visitingFlat) {
		this.visitingFlat = visitingFlat;
	}
    
    
}
