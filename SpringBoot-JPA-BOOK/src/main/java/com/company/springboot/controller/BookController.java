package com.company.springboot.controller;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.company.springboot.model.Book;
import com.company.springboot.service.BookService;

@RestController
public class BookController {
	
	@Autowired
	BookService bs;
	
	@RequestMapping(method = RequestMethod.GET, value = "/book")
	public List<Book> getAll(){
		return bs.getAll();
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/book/{id}")
	public Optional<Book> getOne(@PathVariable int id) {
		return bs.getOne(id);
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/book")
	public Book addBook(@RequestBody Book book) {
		return bs.addBook(book);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/book/{id}")
	public Book update(@RequestBody Book b, @PathVariable int id) {
		return bs.update(b, id);
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/book/{id}")
	public int deleteOne(@RequestBody Book b, @PathVariable int id) {
		return bs.deleteOne(b, id);
	}
	

}
