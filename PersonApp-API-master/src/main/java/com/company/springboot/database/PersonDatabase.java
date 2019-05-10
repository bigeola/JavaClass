package com.company.springboot.database;

import java.util.HashMap;
import java.util.Map;

import com.company.springboot.model.Person;

public class PersonDatabase {
	
	private static Map<Integer,Person> personList = new HashMap<>();
	
	
	public static Map<Integer, Person> getPersonList(){
		return personList;
	}

}
