package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.UUID;

import org.junit.BeforeClass;
import org.junit.Test;
import com.cisc181.core.*;
import com.cisc181.eNums.*;
import com.cisc181.exceptions.*;
import java.util.Date;

public class Student_Test {
	
	static ArrayList<Course> couList;
	static ArrayList<Semester> semList;
	static ArrayList<Section> secList;
	static ArrayList<Student> stuList;
	

	@BeforeClass
	public static void setup() throws Exception {
		couList = new ArrayList<Course>();
		couList.add(new Course (UUID.randomUUID(), "CHEM103", 4, eMajor.CHEM));
		couList.add(new Course (UUID.randomUUID(), "ECON 100", 3, eMajor.BUSINESS));
		couList.add(new Course (UUID.randomUUID(), "PHYS207", 4, eMajor.PHYSICS));
		
		semList = new ArrayList<Semester>();
		semList.add(new Semester (UUID.randomUUID(), new Date(1), new Date(2)));
		semList.add(new Semester (UUID.randomUUID(), new Date(1), new Date(2)));
		
		secList = new ArrayList<Section>();
		secList.add(new Section (couList.get(0).getCourseID(), UUID.randomUUID(), 012));
		secList.add(new Section (couList.get(1).getCourseID(), UUID.randomUUID(), 345));
		secList.add(new Section (couList.get(2).getCourseID(), UUID.randomUUID(), 678));
		
		stuList = new ArrayList<Student>();
		stuList.add(new Student ("a", "a", "a", new Date(0), eMajor.BUSINESS, "Smyth hall", 
				"(302)-098-1234", "a@udel.edu"));
		stuList.add(new Student ("b", "b", "b", new Date(0), eMajor.COMPSI, "Smyth hall", 
				"(302)-987-2345", "b@udel.edu"));
		stuList.add(new Student ("c", "c", "c", new Date(0), eMajor.COMPSI, "Smyth hall", 
				"(302)-876-3456", "c@udel.edu"));
		stuList.add(new Student ("d", "d", "d", new Date(0), eMajor.COMPSI, "Smyth hall", 
				"(302)-765-4567", "d@udel.edu"));
		stuList.add(new Student ("e", "e", "e", new Date(0), eMajor.COMPSI, "Smyth hall", 
				"(302)-654-5678", "e@udel.edu"));
		stuList.add(new Student ("f", "f", "f", new Date(0), eMajor.CHEM, "Smyth hall", 
				"(302)-543-6789", "f@udel.edu"));
		stuList.add(new Student ("g", "g", "g", new Date(0), eMajor.NURSING, "Smyth hall", 
				"(302)-432-7890", "g@udel.edu"));
		stuList.add(new Student ("h", "h", "h", new Date(0), eMajor.NURSING, "Smyth hall", 
				"(302)-210-8901", "@udel.edu"));
		stuList.add(new Student ("i", "i", "i", new Date(0), eMajor.NURSING, "Smyth hall", 
				"(302)-109-9012", "i@udel.edu"));
		stuList.add(new Student ("j", "j", "j", new Date(0), eMajor.NURSING, "Smyth hall", 
				"(302)-098-0123", "j@udel.edu"));
	}

	
	
	public static void ChangeMajor(eMajor m, Student s){
		s.setMajor(m);
		
	}
	@Test
	public void testCangeMajor() {
		ChangeMajor(eMajor.CHEM, stuList.get(1));
		assertEquals(eMajor.CHEM, stuList.get(1).getMajor()); 
	}


}

