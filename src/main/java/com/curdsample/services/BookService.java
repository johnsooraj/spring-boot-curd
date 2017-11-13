package com.curdsample.services;

import org.springframework.data.jpa.repository.JpaRepository;

import com.curdsample.models.Books;

public interface BookService extends JpaRepository<Books, Long>{

}
