package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
	
	@RequestMapping("/")
	public String home() {
		return "index";
	}

	
	@RequestMapping("/form1")
	public String form1(@RequestParam String name) {
		System.out.println(name);
		return "index";
	}
	
}
