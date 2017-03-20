package com.cisc181.core;

import java.util.UUID;

public class Section {
	
	private UUID courseID;
	private UUID semesterID;
	private UUID sectionID = UUID.randomUUID();
	private int roomID;
	
	public Section(){
		
	}
	
	public Section(UUID courseID, UUID semesterID, int roomID){
		this.courseID = courseID;
		this.semesterID = semesterID;
		this.roomID = roomID;
	}
	
	public UUID getSectionID(){
		return sectionID;
	}
	
	public UUID getSemesterID(){
		return semesterID;
	}
	
	public void setRoomID(int roomID){
		this.roomID = roomID;
	}
	
	public int getRoomId(){
		return roomID;
	}
	
	public UUID getCourseID(){
		return courseID;
	}
	
}

