package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test")
public class TestController {
    
	@RequestMapping(value = "/login") //test/login
	public String x() {
		System.out.println("TestController.x()=======");
		return "login";
	}
}
