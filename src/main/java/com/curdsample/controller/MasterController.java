package com.curdsample.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.curdsample.models.Books;
import com.curdsample.services.BookService;

@Controller
public class MasterController {

	@Autowired
	BookService bookService;

	@RequestMapping(value = "")
	public String index() {
		return "index";
	}

	@ResponseBody
	@RequestMapping(value = "/books", method = RequestMethod.GET)
	public List<Books> getAllBooks() {
		return bookService.getAllBooks();
	}

	@ResponseBody
	@RequestMapping(value = "/saveBook", method = RequestMethod.GET)
	public String saveBookTest() {
		Books books = new Books(1l, "test 1", "auth 1");
		Books books2 = new Books(2l, "test 2", "auth 2");
		Books books3 = new Books(3l, "test 3", "auth 3");
		Books books4 = new Books(4l, "test 4", "auth 4");
		List<Books> newBookList = new ArrayList<>();
		newBookList.add(books);
		newBookList.add(books2);
		newBookList.add(books3);
		newBookList.add(books4);
		newBookList.forEach(obj -> bookService.saveBook(obj));
		return "Save Success : "+newBookList.toString();
	}

	@ResponseBody
	@RequestMapping(value = "/books/{bookName}", method = RequestMethod.GET)
	public List<Books> getBookByName(@PathVariable String bookName) {
		return bookService.getBookByName(bookName);
	}

	@ResponseBody
	@RequestMapping(value = "/books", method = RequestMethod.POST)
	public Books saveBook(@RequestBody Books books) {
		return bookService.saveBook(books);
	}
	
	@ResponseBody
	@RequestMapping(value = "/books/{id}", method = RequestMethod.DELETE)
	public Boolean deleteBook(@PathVariable Long id) {
		return bookService.deleteBook(id);
	}
	
	@ResponseBody
	@RequestMapping(value = "/books", method = RequestMethod.PUT)
	public Books updateBook(@RequestBody Books books) {
		return bookService.updateBook(books);
	}

}
