package com.curdsample.dao.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.curdsample.dao.BooksDao;
import com.curdsample.models.Books;
import com.curdsample.repository.BooksRepository;

@Repository
@Transactional
public class BooksDaoImpl implements BooksDao {

	@Autowired
	BooksRepository booksRepository;

	@Override
	public Books saveBook(Books books) {
		booksRepository.save(books);
		return books;
	}

}
