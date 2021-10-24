package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

	@RequestMapping("/aaa")
	public String aaa() {
		System.out.println("aaa()함수 호출===============");
		return "main"; //jsp파일만 있으니 viewResolver가 있다 사용한다는 뜻이다.
	}
}
