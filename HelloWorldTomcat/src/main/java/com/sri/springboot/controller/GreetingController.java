package com.sri.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

	@RequestMapping
	public String sayHello() {
		return "Have a Nice Day !!!";
	}
}
