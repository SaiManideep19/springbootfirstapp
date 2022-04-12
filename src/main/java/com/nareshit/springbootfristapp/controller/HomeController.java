package com.nareshit.springbootfristapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	
	@GetMapping(value="/test")
	public  String test() {
		System.out.println("Welcome to Spring Boot Application.");
		return "Hello World";
	}
}
