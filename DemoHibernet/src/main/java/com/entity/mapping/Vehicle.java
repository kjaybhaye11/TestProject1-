package com.entity.mapping;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Vehicle {

	@Id
	private int vid;
	private String vehiclename;
	@OneToOne
	private Person person;
	
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	public Vehicle(int vid, String vehiclename, Person person) {
		super();
		this.vid = vid;
		this.vehiclename = vehiclename;
		this.person = person;
	}
	public int getVid() {
		return vid;
	}
	public void setVid(int vid) {
		this.vid = vid;
	}
	public String getVehiclename() {
		return vehiclename;
	}
	public void setVehiclename(String vehiclename) {
		this.vehiclename = vehiclename;
	}
	public Vehicle(int vid, String vehiclename) {
		super();
		this.vid = vid;
		this.vehiclename = vehiclename;
	}
	public Vehicle() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
