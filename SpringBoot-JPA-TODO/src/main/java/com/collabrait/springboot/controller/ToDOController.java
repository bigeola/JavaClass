package com.collabrait.springboot.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.collabrait.springboot.model.TodoModel;
import com.collabrait.springboot.service.ToDoService;

@RestController
public class ToDOController {
	
	@Autowired
	ToDoService tds;
	
	@RequestMapping(method = RequestMethod.GET, value = "/todo")
	public List<TodoModel> findAll(){
		return tds.findAll();
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/todo/{id}")
	public int findOne(@PathVariable int id) {
		return tds.findOne(id);
		
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/todo")
	public int addTask(@RequestBody TodoModel todo) {
		return tds.addTask(todo);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/todo/{id}")
	public TodoModel updateTask(@RequestBody TodoModel todo, @PathVariable int id) {
		return tds.updateTask(todo, id);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/todo/{id}")
	public int deleteTask(@PathVariable int id) {
		return tds.deleteTask(id);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/todo")
	public int deleteAll() {
		return tds.deleteAll();
	}

}
