package com.aes.collegemanagement.serviceImpl;
import com.aes.collegemanagement.model.*;
import java.util.*;
import com.aes.collegemanagement.service.Aes;


public class Karvenagar implements Aes {

	Scanner sc=new Scanner(System.in);
	
	List<Course> clist=new ArrayList<>();		
	List<Faculty> flist=new ArrayList<>();
	List<Batch> blist=new ArrayList<>();
	List<Student> slist=new ArrayList<>();
	
	
	public void addCourse() {
	
		Course course=new Course();
		System.out.println("Enter course id :");
		int cid=sc.nextInt();
		course.setCid(cid);
		System.out.println("Enter course name :");
		String name=sc.next();
		course.setName(name);
		
		course.setCid(cid);
		clist.add(course);
		System.out.println("Course details added succesfully...");
		
	}
	public void viewCourse() {
		
		System.out.println("Following are the course details:-");
		
		for(Course co:clist) {
			System.out.println("Course Id:"+co.getCid());
			System.out.println("Course Name:"+co.getName());
		}
	}
	public void addFaculty() {
		
		boolean fflag=false;
		Faculty faculty=new Faculty();
		
		System.out.println("Enter Faculty id:");
		int fid=sc.nextInt();
		faculty.setFid(fid);
		
		System.out.println("Enter Faculty name");
		String fname=sc.next();
		faculty.setFname(fname);
		
		System.out.println("Enter faculty name for course id :");
		int cid=sc.nextInt();
		
		for(Course co:clist) {
			if(cid==co.getCid()) {
				
				faculty.setCourse(co);
				flist.add(faculty);
				fflag=true;
				break;
			}
		}
		if(fflag==true) {
			System.out.println("Faculty Details added successfully....");
		}
		else {
			System.out.println("You added wrong details!!");
		}
		
	}
	public void viewFaculty() {
		System.out.println("Following are the faculty details!!");
		
		Iterator<Faculty>itr=flist.iterator();
		
		for(Faculty fac:flist) {
			
			System.out.println("Course id:"+fac.getCourse().getCid());
			System.out.println("Course name :"+fac.getCourse().getName());
			System.out.println("Faculty id:"+fac.getFid());
			System.out.println("Faculty name:"+fac.getFname());
		}
		
	}
	public void addBatch() {
		
		boolean bflag=false;
		
		Batch batch=new Batch();
		
		System.out.println("Enter batch id:");
		int bid=sc.nextInt();
		batch.setBid(bid);
		System.out.println("Enter batch name :");
		String bname=sc.next();
		batch.setBname(bname);
		System.out.println("Enter batch name for faculty id");
		int fid=sc.nextInt();
		
		for(Faculty faculty:flist) {
			
			if(bid==faculty.getFid()) {
				batch.setfaculty(faculty);
				blist.add(batch);
				bflag=true;
				 break;  
				
			}
		}
		
		if(bflag==true) {
			System.out.println("Batch Details Add Successfully...");
		}
		else {
			System.out.println("Please enter faculty details!!!");
		}
	}
	public void viewBatch() {
		
		System.out.println("Following are the details fo batch:");
		
		for(Batch bch:blist) {
			
			System.out.println("Course Id :"+bch.getfaculty().getCourse().getCid());
			System.out.println("Course name :"+bch.getfaculty().getCourse().getName());
			System.out.println("Faculty Id :"+bch.getfaculty().getFid());
			System.out.println("Faculty name : "+bch.getfaculty().getFname());
			System.out.println("Batch Id :"+bch.getBid());
			System.out.println("Batch name:"+bch.getBname());
		}
	}
	public void addStudent() {
		
		boolean sflag=false;
		
		
		Student student=new Student();
		System.out.println("Enter Student id:");
		int sid=sc.nextInt();
		student.setSid(sid);
		System.out.println("Enter Student name :");
		String name=sc.next();
		student.setSname(name);
		
		System.out.println("Enter the batch id:");
		int bid=sc.nextInt();
		
		for(Batch batch:blist) {
			if(bid==batch.getBid()) {
				student.setBatch(batch);
				slist.add(student);
				sflag=true;
				break;
			}
		}
		if(sflag==true) {
			System.out.println("Student details added successfully.... ");
		}
		else {
			System.out.println("Please enter valid details!!!!");
		}
	}
	public void viewStudent() {
		
		System.out.println("Following are the details for student....");
		
		for(Student std:slist) {
			System.out.println("Course Id:"+std.getbatch().getfaculty().getCourse().getCid());
			System.out.println("Course name:"+std.getbatch().getfaculty().getCourse().getName());
			System.out.println("Faculty Id:"+std.getbatch().getfaculty().getFid());
			System.out.println("Faculty name:"+std.getbatch().getfaculty().getFname());
			System.out.println("Batch Id:"+std.getbatch().getBid());
			System.out.println("Batch name :"+std.getbatch().getBname());
			System.out.println("Student id:"+std.getSid());
			System.out.println("Stduent name:"+std.getSname());
		}
	}

}
