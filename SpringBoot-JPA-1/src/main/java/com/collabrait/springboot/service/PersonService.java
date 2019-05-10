package com.collabrait.springboot.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.collabrait.springboot.model.Person;
import com.collabrait.springboot.repository.PersonRepository;

@Service
public class PersonService {

	@Autowired
	PersonRepository repo;
	
	public List<Person> findAll(){
		List<Person> persons = new ArrayList<>();
		repo.findAll().forEach(persons::add);
		return persons;
	}
	
	public int findOne(int id) {
		repo.findById(id);
		return 0;
	}
	
	public Person addPerson(Person person) {
		return repo.save(person);
	}
	
	public Person uodatePerson(Person person, int id) {
		return repo.save(person);
	}
	
	public int deleteOne(int id) {
		repo.deleteById(id);
		return id;
	}
	
	public  void deleteAll() {
		repo.deleteAll();
	}
	
}
