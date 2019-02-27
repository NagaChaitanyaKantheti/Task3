package com.ownTask.Task3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

import com.ownTask.Task3.models.jpa.Book;
import com.ownTask.Task3.models.jpa.BookCategory;
import com.ownTask.Task3.repository.BookCategoryRepository;


@SpringBootApplication
@EnableEurekaServer
public class Task3Application implements CommandLineRunner {
	
	@Autowired
    private BookCategoryRepository bookCategoryRepository; 
	
	public static void main(String[] args) {
		SpringApplication.run(Task3Application.class, args);
	}	
	
	@Override
	public void run(String... args) {
		bookCategoryRepository.save(new BookCategory("Category 1", new Book("Hello Koding 1"), new Book("Hello Koding 2")));
	}
}

