package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Testcontroller {
	@RequestMapping("/main")
	public String test() {//함수 하나가 서블릿 역할을 대신함
		System.out.println("test함수 호출됨==============");
		//요청에 대한 응답처리 jsp 페이지명 
         return "main";	
   }
}
