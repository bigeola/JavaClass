package com.company.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="BookList")
public class Book {
	
	@Column(name="ISBN")
	@Id
	@GeneratedValue
	private int bookId;
	
	@Column(name= "Book_name", nullable=false)
	private String bookName;
	
	@Column(name= "Author_name", nullable=false)
	private String authorName;
	
	@Column(name= "Publisher", nullable=false)
	private String publisher;
	
	@Column(name= "First_Edition", nullable=false)
	private Boolean newRevision;

	public Book(int bookId, String bookName, String authorName, String publisher, Boolean newRevision) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.authorName = authorName;
		this.publisher = publisher;
		this.newRevision = newRevision;
	}

	public Book(String bookName, String authorName, String publisher, Boolean newRevision) {
		super();
		this.bookName = bookName;
		this.authorName = authorName;
		this.publisher = publisher;
		this.newRevision = newRevision;
	}

	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public Boolean getNewRevision() {
		return newRevision;
	}

	public void setNewRevision(Boolean newRevision) {
		this.newRevision = newRevision;
	}

	
}
