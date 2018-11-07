package com.mdwbp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BaseController {
	@RequestMapping(value = "/")
	public String getIndex() {
		return "index";
	}
	
	@RequestMapping("/home")
	public String getHomePage() {
		return "home";
	}
	
}
