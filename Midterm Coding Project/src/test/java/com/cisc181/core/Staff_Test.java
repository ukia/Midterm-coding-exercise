package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.*;
import com.cisc181.exceptions.*;
import java.util.Date;

public class Staff_Test {
	ArrayList<Staff> Slist = new ArrayList<Staff>();

	@BeforeClass
	public static void setup() {
	}
	
	@Test(expected = PersonException.class )
	public void test() throws PersonException {
		
		Slist.add(new Staff("A", "B", "C", new Date(0), "Smith Hall", "(123)-456-7890", "abc@udel.edu",
				"1-2", 0, 10000, new Date(100),eTitle.MISS));
		Slist.add(new Staff("D", "E", "F", new Date(0), "Smith Hall", "(234)-567-8901", "def@udel.edu",
				"2-3", 1, 10000, new Date(100),eTitle.MS));
		Slist.add(new Staff("G", "H", "I", new Date(0), "Smith Hall", "(345)-678-9012", "ghi@udel.edu",
				"3-4", 2, 10000, new Date(100),eTitle.MR));
		Slist.add(new Staff("J", "K", "L", new Date(0), "Smith Hall", "(456)-789-0123", "jkl@udel.edu",
				"4-5", 3, 10000, new Date(100),eTitle.DR));
		Slist.add(new Staff("R", "P", "Q", new Date(0), "Smith Hall", "(789)-012-3456", "rpq@udel.edu",
				"5-6", 4, 10000, new Date(100),eTitle.PROF));

		double avgs = (Slist.get(0).getSalary() + Slist.get(1).getSalary() + Slist.get(2).getSalary() + Slist.get(3).getSalary() + Slist.get(4).getSalary()) / 5;
	
        assertTrue(avgs == 10000);
	}	
	
	@Test(expected = PersonException.class )
	public void testInvalidDOB() throws PersonException{
		Calendar nc = Calendar.getInstance();
		nc.set(Calendar.YEAR, 1900);
		Date invalidDOB = nc.getTime();
		Staff invd = new Staff("A", "B", "C", invalidDOB, "Smith Hall", "(123)-456-7890", "abc@udel.edu",
				"1-2", 0, 10000, new Date(100),eTitle.MISS);
		
	}
	@Test(expected = PersonException.class )
	public void testInvalidPhone() throws PersonException{
		Staff invp = new Staff("A", "B", "C", new Date(0), "Smith Hall", "+86-133-930-1234", "abc@udel.edu",
				"1-2", 0, 10000, new Date(100),eTitle.MISS);
	
	}
	
}
