package com.curdsample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MasterController {

	@RequestMapping(value ="")
	public String index(ModelMap abc){
		abc.put("name", "john");
		return "index";
	}
	
}
