package com.curdsample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.curdsample.services.BookService;

@Controller
public class MasterController {

	@Autowired
	BookService bookService;

	@RequestMapping(value = "")
	public String index() {
		return "redirect:/welcome";
	}

	@RequestMapping(value = { "/welcome" })
	public String welcomePage() {
		return "login";
	}

	@RequestMapping(value = { "/registration" })
	public String registrationPage() {
		return "register";
	}

	@RequestMapping(value = { "/home" })
	public String homePage() {
		return "index";
	}

}
