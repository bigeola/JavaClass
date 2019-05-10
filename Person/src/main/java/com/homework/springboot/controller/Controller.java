package com.homework.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.homework.springboot.model.Person;
import com.homework.springboot.service.PersonService;

@RestController
public class Controller {
		
		@Autowired
		PersonService service;
		
		@RequestMapping(method = RequestMethod.GET, value = "/person")
		public List<Person> getAll(){
			return service.getAllpeople();
			
		}
		
		@RequestMapping(method = RequestMethod.GET, value = "/person/{id}")
		public Person getOne(@PathVariable int id){
			return service.getPerson(id);
			
		}

}
