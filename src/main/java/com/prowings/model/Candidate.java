package com.prowings.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class Candidate {

	@Id
	int roll;
	@Column
	String name;
	@Column
	String address;
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
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
	@Override
	public String toString() {
		return "Candidate [roll=" + roll + ", name=" + name + ", address=" + address + "]";
	}
	public Candidate() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Candidate(int roll, String name, String address) {
		super();
		this.roll = roll;
		this.name = name;
		this.address = address;
	}
	
	
}
