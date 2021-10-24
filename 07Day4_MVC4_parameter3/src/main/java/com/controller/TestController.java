package com.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.dto.LoginDTO;

@Controller
public class TestController {
	@RequestMapping(value = "/ccc", method = RequestMethod.GET)
	public String xxx3(ArrayList<String> list) {
		list.add("홍길동");
		list.add("홍길동2");
		list.add("홍길동3");
		list.add("홍길동4");
		
		return "main3";
	}
	@RequestMapping(value = "/bbb", method = RequestMethod.GET)
	public String xxx2(@ModelAttribute("xxx") ArrayList<String> list) {
		list.add("홍길동");
		list.add("홍길동2");
		list.add("홍길동3");
		list.add("홍길동4");
		
		return "main2";
	}
	@RequestMapping(value = "/aaa", method = RequestMethod.GET)
	public ModelAndView xxx(ArrayList<String> list) {
		list.add("홍길동");
		list.add("홍길동2");
		list.add("홍길동3");
		list.add("홍길동4");
		ModelAndView mav=new ModelAndView();
		mav.addObject("list", list);
		mav.setViewName("main");
		return mav;
	}

}
