package com.ownTask.Task3.models.jpa;

import javax.persistence.*;

@Entity
public class Book {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String name;
	
	@ManyToOne
	@JoinColumn
	private BookCategory bookCategory;
	
	
	
	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public BookCategory getBookCategory() {
		return bookCategory;
	}



	public void setBookCategory(BookCategory bookCategory) {
		this.bookCategory = bookCategory;
	}



	public Book(String name) {
		this.name=name;
	}
}
