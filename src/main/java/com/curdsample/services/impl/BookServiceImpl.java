package com.curdsample.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curdsample.dao.BooksDao;
import com.curdsample.models.Books;
import com.curdsample.services.BookService;

@Service
public class BookServiceImpl implements BookService{

	@Autowired
	BooksDao booksDao;

	@Override
	public List<Books> getAllBooks() {
		return null;
	}

	@Override
	public Books saveBook(Books books) {
		return booksDao.saveBook(books);
	}
	
}
