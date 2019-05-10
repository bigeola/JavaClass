package com.homework.springboot.repository;

import java.util.Map;
import java.util.TreeMap;

import org.springframework.stereotype.Repository;

import com.homework.springboot.model.Person;

@Repository
public class DataBase {

	private static Map<Integer, Person> person = new TreeMap();

	public static Map<Integer, Person> getPerson() {
		return person;
	}

}
