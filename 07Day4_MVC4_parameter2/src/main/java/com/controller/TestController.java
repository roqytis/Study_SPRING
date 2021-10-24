package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.dto.LoginDTO;

@Controller
public class TestController {
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String loginForm() {
		System.out.println("loginForm======");
		return "loginForm";
	}
	@RequestMapping(value = "/login1", method = RequestMethod.POST)
	public String login1(LoginDTO dto) {
		System.out.println("login1.post======"+dto);
		return "login1"; //key 소문자로 시작하는 클라스 이름
	}
	@RequestMapping(value = "/login2", method = RequestMethod.POST)
	public ModelAndView login2(LoginDTO dto) {
		System.out.println("login2.post======"+dto);
	    ModelAndView mav =new ModelAndView();
	    mav.addObject("login", dto);
	    mav.setViewName("login2");
		return mav; //key 소문자로 시작하는 클라스 이름
	}

	@RequestMapping(value = "/login3", method = RequestMethod.POST)
	public String login3(@ModelAttribute("xxx")LoginDTO dto) {
		System.out.println("login3.post======"+dto);
		return "login3"; //key 소문자로 시작하는 클라스 이름
	}
	/*
	 * @RequestMapping("/aaa") public ModelAndView xxx2() {//리턴타입 주의
	 * System.out.println("/aaa======================"); ModelAndView mav= new
	 * ModelAndView();//직접 객체 생성 mav.addObject("username", "홍길동");//데이터 저장
	 * mav.addObject("age", 20); mav.setViewName("main2");// 전달 받을 view 페이지 이름만 //
	 * /WEB-INF/views/main2.jsp return mav; //ModelAndView 리턴 }
	 */
}
