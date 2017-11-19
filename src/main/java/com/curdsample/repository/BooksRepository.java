package com.curdsample.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.curdsample.models.Books;

public interface BooksRepository extends JpaRepository<Books, Long>{
	
	public List<Books> findBybookNameContaining(String bookName);

}
