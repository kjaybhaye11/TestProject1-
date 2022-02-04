package com.entity.mapping;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Emp {

	@Id
	private int eid;
	private int ename;
	private Dept dept;
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public int getEname() {
		return ename;
	}
	public void setEname(int ename) {
		this.ename = ename;
	}
	public Dept getDept() {
		return dept;
	}
	public void setDept(Dept dept) {
		this.dept = dept;
	}
	public Emp(int eid, int ename, Dept dept) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.dept = dept;
	}
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Emp [eid=" + eid + ", ename=" + ename + ", dept=" + dept + "]";
	}
	
	
}
