package com.springcore;

public class Student {

	private int studentid;
	private String studentname;
	private String studentAddress; 
	public int getStudentid() {
		return studentid;
	}
	public void setStudentid(int studentid) {
		System.out.println("Student id");
		this.studentid = studentid;
	}
	public String getStudentname() {
		return studentname;
	}
	public void setStudentname(String studentname) {
		System.out.println("Student name");
		this.studentname = studentname;
	}
	public String getStudentAddress() {
		return studentAddress;
	}
	public void setStudentAddress(String studentAddress) {
		System.out.println("Student Address");
		this.studentAddress = studentAddress;
	}
	public Student(int studentid, String studentname, String studentAddress) {
		super();
		this.studentid = studentid;
		this.studentname = studentname;
		this.studentAddress = studentAddress;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [studentid=" + studentid + ", studentname=" + studentname + ", studentAddress=" + studentAddress
				+ "]";
	}
	
	
	
	
}
