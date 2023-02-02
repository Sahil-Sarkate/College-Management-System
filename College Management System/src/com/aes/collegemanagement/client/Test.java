package com.aes.collegemanagement.client;
import com.aes.collegemanagement.model.*;
import com.aes.collegemanagement.service.*;
import com.aes.collegemanagement.serviceImpl.*;
import java.util.*;

public class Test {
	
	public static void main(String args[]) {
		
		Aes col= new Karvenagar();
		
		boolean flag=true;
		
		while(flag) {
			Scanner sc=new Scanner(System.in);
			System.out.println("----------------------------");
			System.out.println("Press 1 to add course\n"+"Press 2 to view course\n"+"Press 3 to add faculty \n"+"Press 4 to view faculty \n"+"Press 5 to add batch \n"+"Press 6 to view batch \n"+"Press 7 to add student \n"+"Press 8 to view student \n"+"Press 9 for exit\n");
			System.out.println("Enter Your choice");
			
			int ch=sc.nextInt();
			
			switch(ch) {
			case 1:
				col.addCourse();
				break;
			case 2:
				col.viewCourse();
				break;
			case 3:
				col.addFaculty();
				break;
			case 4:
				col.viewFaculty();
				break;
			case 5:
				col.addBatch();
				break;
			case 6:
				col.viewBatch();
				break;
			case 7:
				col.addStudent();
				break;
			case 8:
				col.viewStudent();
				break;
			case 9:
				flag=false;
				System.out.println("Thank you");
				break;
			default:
				System.out.println("Please enter correct choice");
				break;
			}
		}
		
	}

}
