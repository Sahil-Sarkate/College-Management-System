package com.aes.collegemanagement.model;

public class Faculty {

	private int fid;
	private String fname;
	private Course course;
	
	public void setFid(int fid) {
		this.fid=fid;
	}
	
	public void setFname(String fname) {
		this.fname=fname;
	}
	
	public void setCourse(Course course) {
		this.course=course;
	}
	
	public int getFid() {
		return fid;
	}
	
	public String getFname() {
		return fname;
	}
	
	public Course getCourse() {
		return course;
	}
}
