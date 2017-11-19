package com.curdsample.dao.impl;

import java.util.List;

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

	@Override
	public List<Books> getAllBooks() {
		return booksRepository.findAll();
	}

	@Override
	public Boolean deleteBook(Long Id) {
		booksRepository.delete(Id);
		return true;
	}

	@Override
	public Books updateBook(Books books) {
		return booksRepository.saveAndFlush(books);
	}

	@Override
	public List<Books> getBookByName(String bookName) {
		List<Books> test = booksRepository.findBybookNameContaining(bookName);
		return test;
	}

}
