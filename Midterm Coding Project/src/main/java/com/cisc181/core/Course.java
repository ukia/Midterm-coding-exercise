package com.cisc181.core;

import java.util.UUID;

import com.cisc181.eNums.eMajor;

public class Course {
	private UUID CourseID = UUID.randomUUID();
	private String courseName;
	private int gradePoints;
	private eMajor Major;
	
	public Course(){

}
	
	public UUID getCourseID(){
		return CourseID;
	}
	
	public Course(String Name, int grade){
		setCourseName(Name);
		setGradePoints(grade);
	}
	
	public Course(UUID courseID, String courseName, int gradePoints, eMajor Major) {
		
		this.CourseID = CourseID;
		this.courseName = courseName;
		this.gradePoints = gradePoints;
		this.Major = Major;
	}

	public int getGradePoints(){
		return gradePoints;
	}
	
	public void setGradePoints(int gradePoints){
		this.gradePoints = gradePoints;
	}
	
	public void setCourseName (String courseName){
		this.courseName = courseName;
	}
	
	public String getCourseName(){
		return courseName;
	}
	
	public eMajor geteMajor(){
		return Major;
	}
	
		
}
