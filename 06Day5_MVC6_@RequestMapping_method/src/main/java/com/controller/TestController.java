package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//@Controller    //Bean생성 등록필요함  Servlet-context.xml에서 
@Controller
public class TestController {
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)//get방식 요청 
	public String loginForm() {
		System.out.println("TestController.loginForm get 요청됨===============");
		return "loginForm";//viewResolver 사용 prefix, suffix 붙임 
		// /WEB-INF/views/   loginForm   .jsp 
	}	
		
	@RequestMapping(value = "/login", method = RequestMethod.POST)//get방식 요청 
	public String login() {
		System.out.println("TestController.login Post 요청됨===============");
		return "login";//login.jsp
	}


}
