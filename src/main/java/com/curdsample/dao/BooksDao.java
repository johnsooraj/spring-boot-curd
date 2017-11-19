package com.curdsample.dao;

import java.util.List;

import com.curdsample.models.Books;

public interface BooksDao {
	
	public List<Books> getAllBooks();

	public Books saveBook(Books books);

	public Boolean deleteBook(Long Id);

	public Books updateBook(Books books);

	public List<Books> getBookByName(String bookName);
}
