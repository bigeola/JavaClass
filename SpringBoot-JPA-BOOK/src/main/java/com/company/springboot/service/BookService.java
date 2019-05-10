package com.company.springboot.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.springboot.model.Book;
import com.company.springboot.repository.BookRepository;

@Service
public class BookService {
	
	@Autowired
	BookRepository br;
	
	public List<Book> getAll(){
		List<Book> bk = new ArrayList<>();
		br.findAll().forEach(bk::add);
		return bk;
	}
	
	public Optional<Book> getOne(int id) {
		return br.findById(id);
		
	}
	
	public Book addBook(Book book) {
		br.save(book);
		return book;
	}
	
	public Book update(Book b, int id) {
		br.save(b);
		return b;
	}

	public int deleteOne(Book b, int id) {
		br.delete(b);
		return 0;
	}
	
	public String deleteAll() {
		br.deleteAll();
		return null;
	}
}
