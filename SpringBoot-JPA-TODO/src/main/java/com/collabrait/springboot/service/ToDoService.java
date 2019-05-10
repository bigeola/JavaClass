package com.collabrait.springboot.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.collabrait.springboot.model.TodoModel;
import com.collabrait.springboot.repository.ToDoRepository;

@Service
public class ToDoService {

	@Autowired
	ToDoRepository db;
	
	public List<TodoModel> findAll(){
		List<TodoModel> todo = new ArrayList<>();
		db.findAll().forEach(todo::add);
		return todo;
	}
	
	public int findOne(int id) {
		db.findById(id);
		return 0;
	}
	
	public int addTask(TodoModel todo) {
		db.save(todo);
		return 0;
	}
	
	public TodoModel updateTask(TodoModel todo, int id) {
		return db.save(todo);
	}
	
	public int deleteTask(int id) {
		db.deleteById(id);
		return id;
	}
	
	public int deleteAll() {
		db.deleteAll();
		return 0;
	}
}
