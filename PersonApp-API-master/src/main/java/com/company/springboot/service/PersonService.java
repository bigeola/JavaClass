package com.company.springboot.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.company.springboot.database.PersonDatabase;
import com.company.springboot.model.Person;

@Service
public class PersonService {

	private Map<Integer, Person> persons = PersonDatabase.getPersonList();

	public PersonService() {
		persons.put(12, new Person(12, "Mike", "Mike", "Doverlane", 578848484));

	}
	
	public List<Person> getPersons(){
		return new ArrayList<>(persons.values());
	}
	
	public Person getPerson(int id) {
		return persons.get(id);
	}

}
