package com.curdsample.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.curdsample.models.Books;

public interface BooksRepository extends JpaRepository<Books, Long>{

}
