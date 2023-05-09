package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class Controller {

	@GetMapping
	public String greeting() {
	 return "Hello World";	
	}
	
	@PostMapping
	public String customGreeting(@RequestBody final String input) {
		return "Custom greeting: " + input;
	}
}
