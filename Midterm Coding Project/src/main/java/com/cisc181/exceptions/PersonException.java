package com.cisc181.exceptions;

import java.util.Date;
import com.cisc181.core.Person;


public class PersonException extends Exception{
	private Person person;
	
	public PersonException(Person p){
		this.person = p;
	}
	public Person getperson(){
		return person;
	}
}
 