package com.collabrait.springboot.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.collabrait.springboot.service.PersonService;

import com.collabrait.springboot.model.Person;

@RestController
public class PersonController {
	
	@Autowired
	PersonService ps;
	
	@RequestMapping(method = RequestMethod.GET, value = "/persons")
	public List<Person> findAll(){
		return ps.findAll();
	}

	@RequestMapping(method = RequestMethod.GET, value = "/persons/{id}")
	public int getOne(@PathVariable int id) {
		return ps.findOne(id);
	}

	@RequestMapping(method = RequestMethod.POST, value = "/persons")
	public Person addOne(@RequestBody Person person) {
		return ps.addPerson(person);
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/persons/{id}")
	public Person deleteOne(@RequestBody Person person, @PathVariable int id) {
		return ps.uodatePerson(person, id);
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/persons/{id}")
	public int deleteOne(@PathVariable int id) {
		return ps.deleteOne(id);
	}
}
