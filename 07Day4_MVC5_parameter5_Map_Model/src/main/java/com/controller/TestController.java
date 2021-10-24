package com.controller;

import java.util.ArrayList;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.dto.LoginDTO;

@Controller
public class TestController {
	@RequestMapping(value = "/aaa", method = RequestMethod.GET)
	public String xxx(Model m) {
		m.addAttribute("username", "홍길동"); //setAtt아님
		return "main";
	}

	@RequestMapping(value = "/bbb", method = RequestMethod.GET)
	public String bbb(Map<String,String> map) {
		map.put("address", "서울"); //setAtt아님
		return "main2";
	}

	@RequestMapping(value = "/ccc", method = RequestMethod.GET)
	public String ccc(HttpServletRequest request) {
		request.setAttribute("address", "서울"); //setAtt아님
		return "main2";
	}
	

}
