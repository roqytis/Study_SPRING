package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
    
	@RequestMapping("/aaa")
	public String main() {
	
		return "main";
	}
	
	/*
	 * @RequestMapping ("/main") public String main2() {
	 * 
	 * return "main2"; }
	 */
	 
}
