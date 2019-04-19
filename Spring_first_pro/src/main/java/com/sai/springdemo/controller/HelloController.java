package com.sai.springdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController  // this is for rest controller
public class HelloController {
	
	// this class will be having methods for URL triggered response
	
	@RequestMapping("/hello")  // this is mapping when url /hello is given it will execute this method
	public String sayHi()
	{
		return "Hi";
	}

}
