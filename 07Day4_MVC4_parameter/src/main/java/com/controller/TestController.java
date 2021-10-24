package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController {
	@RequestMapping("/main")
	public String xx() {
		System.out.println("main()==================");
		return "main";
	}

	@RequestMapping("/aaa")
	public ModelAndView xxx2() {//리턴타입 주의 
		System.out.println("/aaa======================");
		ModelAndView mav= new ModelAndView();//직접 객체 생성
		mav.addObject("username", "홍길동");//데이터 저장 
		mav.addObject("age", 20);
		mav.setViewName("main2");// 전달 받을 view 페이지 이름만   
		// /WEB-INF/views/main2.jsp
		return mav;		//ModelAndView 리턴 
	}
}
