package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class FirstController {
@RequestMapping("kkk1")
		public String kkk1() {
			System.out.println("kkk21주소 호출=========");
			return "WEB-INF/views/hello.jsp";
		}
	}
