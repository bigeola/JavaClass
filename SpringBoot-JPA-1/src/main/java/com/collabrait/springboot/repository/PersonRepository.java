package com.collabrait.springboot.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.collabrait.springboot.model.Person;

@Repository
public interface PersonRepository extends CrudRepository<Person, Integer>{

}
