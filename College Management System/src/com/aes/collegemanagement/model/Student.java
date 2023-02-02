package com.aes.collegemanagement.model;

public class Student {

	private int sid;
	private String name;
	private Batch batch;
	
	public void setSid(int sid) {
		this.sid=sid;
	}
	
	public void setSname(String name) {
		this.name=name;
	}
	
	public void setBatch(Batch batch) {
		this.batch=batch;
	}
	
	public int getSid() {
		return sid;
	}
	
	public String getSname() {
		return name;
	}
	
	public Batch getbatch() {
		return batch;
	}
}
