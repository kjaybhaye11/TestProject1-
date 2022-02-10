 package com.ait;

public class Student {

	
	private int sid;
	private String sname;
	private int percent;
	private Course course;
	
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	public Student(int sid, String sname, int percent) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.percent = percent;
	}
	public Student() {
		super();
		
		System.out.println("Default constructor");
		// TODO Auto-generated constructor stub
		
		
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", percent=" + percent + ", course=" + course + "]";
	}
	public int getSid() {
		return sid;
	}
	public Student(Course course) {
		super();
		this.course = course;
	}
	public Student(int sid, String sname, int percent, Course course) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.percent = percent;
		this.course = course;
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
}
