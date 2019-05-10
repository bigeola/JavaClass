package com.collabrait.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.collabrait.springboot.model.Person;
import com.collabrait.springboot.repository.PersonRepository;

@RestController
public class PersonController {
	
	@Autowired
	PersonRepository db;
	
	@RequestMapping(method = RequestMethod.GET, value = "/persons")
	public List<Person> getAll(){
		return db.findAll();
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/persons/{id}")
	public Person getOne(@PathVariable int id){
		return db.findOne(id);
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/persons")
	public Object addOne(@RequestBody Person person){
		return db.addOne(person);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/persons/{id}")
	public int updateOne(@RequestBody Person person, @PathVariable int id){
		return db.updateOne(person);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/persons/{id}")
	public int deleteOne(@PathVariable int id){
		return db.deleteOne(id);
	}

}
