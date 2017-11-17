package com.curdsample.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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
	@RequestMapping(value = "/allBooks", method = RequestMethod.GET)
	public List<Books> getAllBooks() {
		saveBook();
		return null;
	}
	
	@ResponseBody
	@RequestMapping(value = "/saveBook", method = RequestMethod.GET)
	public Books saveBook(){
		Books books = new Books();
		books.setId(1l);
		books.setBookName("first Book");
		books.setBookAuthor("John ");
		return bookService.saveBook(books);
	}

}
