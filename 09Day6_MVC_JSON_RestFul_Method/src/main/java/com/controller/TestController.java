package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TestController {
	
	@RequestMapping(value = "/board" , method=RequestMethod.GET)
	public String get() {
		System.out.println("get====================");
		return "main";//main.jsp
	}
	
	
	
	
	
	
	
	
	
	@RequestMapping(value = "/board" , method=RequestMethod.POST)
	public String POST() {
		System.out.println("POST====================");
		return "main";//home.jsp
	}
	
	
	
	
	
	
	@RequestMapping(value = "/board" , method=RequestMethod.DELETE)
	public String DELETE() {
		System.out.println("DELETE====================");
		return "main";//home.jsp
	}
	@RequestMapping(value = "/board" , method=RequestMethod.PUT)
	public String PUT() {
		System.out.println(".PUT====================");
		return "main";//home.jsp
	}

}
