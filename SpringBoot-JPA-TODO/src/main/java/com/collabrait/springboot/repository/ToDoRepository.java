package com.collabrait.springboot.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.collabrait.springboot.model.TodoModel;

@Repository
public interface ToDoRepository extends CrudRepository<TodoModel, Integer>{

}
