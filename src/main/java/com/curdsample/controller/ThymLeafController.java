package com.curdsample.controller;

import java.time.LocalDateTime;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class ThymLeafController {

	@GetMapping("/thyIndex")
	String index(Model model) {
		model.addAttribute("now", LocalDateTime.now());
		return "index";
	}

}
