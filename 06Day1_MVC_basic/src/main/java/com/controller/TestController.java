package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

	@RequestMapping("/kkk")
	public String xxx() {
		System.out.println("xxx 메소드=========================");
		return "/WEB-INF/views/hello.jsp";
	}
	@RequestMapping("/kkk2")
	public String xxx2() {
		System.out.println("xxx2 메소드=====");
		return "/WEB-INF/views/home.jsp";
	}
}
