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
		return booksDao.getAllBooks();
	}

	@Override
	public Books saveBook(Books books) {
		return booksDao.saveBook(books);
	}

	@Override
	public Boolean deleteBook(Long Id) {
		return booksDao.deleteBook(Id);
	}

	@Override
	public Books updateBook(Books books) {
		return booksDao.updateBook(books);
	}

	@Override
	public List<Books> getBookByName(String bookName) {
		List<Books> test = booksDao.getBookByName(bookName);
		return test;
	}
	
}
