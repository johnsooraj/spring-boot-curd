package com.curdsample.controller;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.curdsample.models.BookDocument;
import com.curdsample.models.Books;
import com.curdsample.services.BookService;

@RestController
public class BooksController {

	@Autowired
	BookService bookService;

	@RequestMapping(value = "/saveBook", method = RequestMethod.GET)
	public String saveBookTest() {
		Books books = new Books();
		BookDocument bookDocument = new BookDocument();
		books.setBookAuthor("john");
		books.setBookName("first book");
		bookDocument.setContent(null);
		bookDocument.setContentType("test content");
		bookDocument.setCreatedDate(new Date());
		bookDocument.setDescription("test description");
		bookDocument.setDocumentOwner(books);
		bookDocument.setFileName(books.getBookName() + "_pdf");
		bookDocument.setTimestamp(new Timestamp(new Date().getTime()));
		books.setBookDocument(bookDocument);
		bookService.saveBook(books);
		return "Save Success";
	}

	@RequestMapping(value = "/books", method = RequestMethod.GET)
	public List<Books> getAllBooks() {
		return bookService.getAllBooks();
	}

	@RequestMapping(value = "/books/{bookName}", method = RequestMethod.GET)
	public List<Books> getBookByName(@PathVariable String bookName) {
		return bookService.getBookByName(bookName);
	}

	@RequestMapping(value = "/books", method = RequestMethod.POST)
	public Books saveBook(@RequestBody Books books) {
		return bookService.saveBook(books);
	}

	@RequestMapping(value = "/books/{id}", method = RequestMethod.DELETE)
	public Boolean deleteBook(@PathVariable Long id) {
		return bookService.deleteBook(id);
	}

	@RequestMapping(value = "/books", method = RequestMethod.PUT)
	public Books updateBook(@RequestBody Books books) {
		return bookService.updateBook(books);
	}

	@RequestMapping(value = "/upload", method = RequestMethod.POST, consumes = "multipart/form-data")
	public String uploadFile(@RequestPart("file") MultipartFile file) {
		System.out.println(file);
		return null;
	}

}
