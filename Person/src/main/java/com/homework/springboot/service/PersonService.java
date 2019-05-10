package com.homework.springboot.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.homework.springboot.model.Person;
import com.homework.springboot.repository.DataBase;

@Service
public class PersonService {
	
	private  Map<Integer, Person> people = DataBase.getPerson();
	
	public PersonService() {
		people.put(1, new Person(1, "Milan", "Emmanuel", "Falls church, VA", "410-334-9987"));
		
		
	}

	public List<Person> getAllpeople() {
		return new ArrayList<Person>(people.values()); 
	}
	
	public Person getPerson(int id) {
		return people.get(id);
	}
	
//	public Person insertPerson(Person person) {
//		person.setId(people.size() + 1);
//		people.put(person.getId(), person);
//		return person;
//	}
//	
//	public Person updatePerson(Person person) {
//		if (person.getId() <= 0) {
//			return null;
//		}
//		people.put(person.getId(), person);
//		return person;
//	}
//	
//	public Person removePerson(int id) {
//		return people.remove(id);
//	}
	

}
