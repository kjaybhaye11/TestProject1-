package com.entity.mapping;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Dept {
  
	@Id
	private int did;
	private String deptname;
	
	@OneToMany
	private List<Emp> emplist;

	@Override
	public String toString() {
		return "Dept [did=" + did + ", deptname=" + deptname + ", emplist=" + emplist + "]";
	}

	public Dept() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Dept(int did, String deptname, List<Emp> emplist) {
		super();
		this.did = did;
		this.deptname = deptname;
		this.emplist = emplist;
	}

	public int getDid() {
		return did;
	}

	public void setDid(int did) {
		this.did = did;
	}

	public String getDeptname() {
		return deptname;
	}

	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}

	public List<Emp> getEmplist() {
		return emplist;
	}

	public void setEmplist(List<Emp> emplist) {
		this.emplist = emplist;
	}
}
