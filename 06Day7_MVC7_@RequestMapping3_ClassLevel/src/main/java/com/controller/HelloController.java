package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hello")
public class HelloController {
@RequestMapping(value = "/login")
	public String xxx() {
		System.out.println(" 이번엔 헬로다");
		return "login";
	}
}
