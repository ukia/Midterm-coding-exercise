package com.cisc181.core;

import java.util.UUID;

public class Enrollment {
	
	private UUID sectionID;
	private UUID studentID;
	private UUID enrollmentID;
	private double grade;
	
	private Enrollment(){

	}
	
	public UUID getSectionID(){
		return sectionID;
	}
	
	public UUID getstudentID(){
		return studentID;
	}
	
	public Enrollment(UUID sectionID, UUID studentID){
		enrollmentID = UUID.randomUUID();
	}
	
	public UUID getEnrollmentID(){
		return enrollmentID;
	}
	
	private void setGrade(double grade){
		this.grade = grade;
	}
	
	public double getGrade(){
		return grade;
	}
}	
		
	