package com.company.springboot.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.company.springboot.model.Book;

@Repository
public interface BookRepository extends CrudRepository<Book, Integer>{

}
