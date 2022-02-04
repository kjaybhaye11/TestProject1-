package com.entity;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
//@Table (name="Stud")
public class Student {
	
public Student(int sid, String sname, int percent, String hobby, Address addr) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.percent = percent;
		this.hobby = hobby;
		this.addr = addr;
	}

@Id	
private int sid;
@Column(name="Studentname",nullable=false)
private String sname;
@Column(name="Percentage",nullable=true)
private int percent;

@Transient
private String hobby;

@Embedded
private Address addr;

public Address getAddr() {
	return addr;
}

public void setAddr(Address addr) {
	this.addr = addr;
}

public Student() {
	super();
	// TODO Auto-generated constructor stub
}

public Student(int sid, String sname, int percent) {
	super();
	this.sid = sid;
	this.sname = sname;
	this.percent = percent;
}

public Student(int sid, String sname, int percent, String hobby) {
	super();
	this.sid = sid;
	this.sname = sname;
	this.percent = percent;
	this.hobby = hobby;
}



public int getSid() {
	return sid;
}

public void setSid(int sid) {
	this.sid = sid;
}

public String getSname() {
	return sname;
}

public void setSname(String sname) {
	this.sname = sname;
}

public int getPercent() {
	return percent;
}

public void setPercent(int percent) {
	this.percent = percent;
}

public String getHobby() {
	return hobby;
}

public void setHobby(String hobby) {
	this.hobby = hobby;
}

@Override
public String toString() {
	return "Student [sid=" + sid + ", sname=" + sname + ", percent=" + percent + ", hobby=" + hobby + "]";
}













}
