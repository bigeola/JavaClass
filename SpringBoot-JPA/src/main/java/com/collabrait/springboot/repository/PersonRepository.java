package com.collabrait.springboot.repository;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.collabrait.springboot.model.Person;

@Repository
public class PersonRepository {

	@Autowired
	JdbcTemplate jdbc;

	public List<Person> findAll() {
		return jdbc.query("select * from person", new BeanPropertyRowMapper(Person.class));
	}

	public Person findOne(int id) {
		return (Person) jdbc.queryForObject("select * from person where id=?", new Object[] { id },
				new BeanPropertyRowMapper(Person.class));
	}

	public int deleteOne(int id) {
		return jdbc.update("delete from person where id=?", new Object[] { id });
	}

	public int addOne(Person person) {
		return jdbc.update("insert into person (id, name, location, birth_date)" + "values(?, ?, ?, ?)",
				new Object[] { person.getId(), person.getName(), person.getLocation(),
						new Timestamp(person.getBirthDate().getTime()) });
	}

	public int updateOne(Person person) {
		return jdbc.update(" update person " + " set name=?, location = ?, birth_date=? " + " where id+?",
				new Object[] { person.getName(), person.getLocation(), new Timestamp(person.getBirthDate().getTime()),
						person.getId() });
	}
}
