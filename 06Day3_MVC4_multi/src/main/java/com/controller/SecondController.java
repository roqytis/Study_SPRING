package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SecondController {
@RequestMapping("kkk2")
	public String kkk2() {
		System.out.println("kkk2 주소 호출=========");
		return "WEB-INF/views/hello.jsp";
	}
}
