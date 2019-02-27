package com.ownTask.Task3.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ownTask.Task3.models.jpa.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer>{
}
