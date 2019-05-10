package com.company.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.company.springboot.model.Person;
import com.company.springboot.service.PersonService;

@RestController
public class PersonController {
	
	@Autowired
	PersonService service;
	
	@RequestMapping(method = RequestMethod.GET, value = "/persons")
	public List<Person> getAll(){
		return service.getPersons();
		
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/persons/{id}")
	public Person getOne(@PathVariable int id){
		return service.getPerson(id);
		
	}

}
