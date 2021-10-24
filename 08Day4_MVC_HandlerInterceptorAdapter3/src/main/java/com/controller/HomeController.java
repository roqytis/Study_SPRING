package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String main() {// 인터셉터 처리 
		System.out.println("HomeController.main 호출");
		return "main";
	}

}
