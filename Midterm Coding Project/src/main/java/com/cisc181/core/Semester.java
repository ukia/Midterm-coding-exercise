package com.cisc181.core;

import java.util.Date;
import java.util.UUID;


public class Semester {
	private UUID SemesterID = UUID.randomUUID();
	private Date startDate = new Date();
	private Date endDate;
	
	public Semester(){
}
	
	public Semester(UUID SemesterID, Date startDate, Date endDate) {
		
		this.SemesterID = SemesterID;
		this.startDate = startDate;
		this.endDate = endDate;
		
		
	}

	public UUID getSemesterID(){
		return SemesterID;
	}
	
	public Date getStartDate(){
		return startDate;
	}
	
	public void ending(){
		 endDate = new Date();
	}
	 
	public void setEndDate(Date endDate){
		this.endDate = endDate;
	}
	
	public Date getEndDate(Date endDate){
		return endDate;
	}
	 
}