package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
  @RequestMapping("/kkk")
	public String kkk() {
		System.out.println("kkk함수 호출===================");
		return "WEB-INF/views/hello.jsp";
	}
	
}
