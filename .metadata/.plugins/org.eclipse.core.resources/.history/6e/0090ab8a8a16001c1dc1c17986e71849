package com.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TestController {

	@RequestMapping(value = "/main", method=RequestMethod.GET)
	public String main() {
		System.out.println("main=================");
		return "main";
	}
   @RequestMapping(value = "/redirect", method= RequestMethod.GET)
	public String redirect(Model m, HttpServletRequest request) {
		System.out.println("redirect 호출====================");
		m.addAttribute("userid","홍길동");
		request.setAttribute("passwd", "1234");
		return "redirect:main";
	}

   @RequestMapping(value = "/forward", method= RequestMethod.GET)
   public String forward(Model m, HttpServletRequest request) {
	   System.out.println("redirect 호출====================");
	   m.addAttribute("userid","홍길동");
	   request.setAttribute("passwd", "1234");
	   return "forward:main";
   }
	
}
