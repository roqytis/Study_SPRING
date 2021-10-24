package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class TestController {
	@RequestMapping(value = "/main", method = RequestMethod.GET)
	public String main() {
		System.out.println("main=================");
		return "main";  //main.jsp
	}
	//redirect-flash<mvc:annotation-driven />필요함
	@RequestMapping(value = "/flash", method = RequestMethod.GET)
	public String redirectFlash(RedirectAttributes m) {//redirect시 객체 전달 있도록 제공
		System.out.println("redirectFlash 호출===================");
		m.addFlashAttribute("userid", "홍길동"); //RedirectAttributes 사용하기 위해
		
		//<mvc:annotation-driven />필요함
		//request.getAttribute사용 getParameter안됨 
		return "redirect:main";
	}
}
