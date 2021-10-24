package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
	//servlet-context.xml에서 /main처리함 
	/*
	 * @RequestMapping public String main() { return "main"; //main.jsp
	 * servlet-context.xml에 등록 }
	 */
	
	  @RequestMapping("/aaa")
	  public String main() { return "main";  }
	 
	

}
