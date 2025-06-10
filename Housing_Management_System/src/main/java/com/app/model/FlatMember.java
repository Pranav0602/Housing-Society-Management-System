package com.app.model;

import jakarta.persistence.*;

@Entity
@Table(name = "flat_members")
public class FlatMember {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @OneToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;
    
    @OneToOne
    @JoinColumn(name = "flat_id", nullable = false)
    private Flat flat;
    
    @Column(nullable = false)
    private boolean isOwner;

	public FlatMember() {
	}

	public FlatMember(Long id, User user, Flat flat, boolean isOwner) {
		super();
		this.id = id;
		this.user = user;
		this.flat = flat;
		this.isOwner = isOwner;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Flat getFlat() {
		return flat;
	}

	public void setFlat(Flat flat) {
		this.flat = flat;
	}

	public boolean isOwner() {
		return isOwner;
	}

	public void setOwner(boolean isOwner) {
		this.isOwner = isOwner;
	}
    
	
	
    
}
