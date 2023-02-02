package com.aes.collegemanagement.model;

public class Batch {

	private int bid;
	private String bname;
	private Faculty faculty;
	
	public void setBid(int bid) {
		this.bid=bid;
	}
	
	public void setBname(String bname) {
		this.bname=bname;
	}
	
	public void setfaculty(Faculty faculty) {
		this.faculty=faculty;
	}
	
	public int getBid() {
		return bid;
	}
	
	public String getBname() {
		return bname;
	}
	
	public Faculty getfaculty() {
		return faculty;
	}
}
