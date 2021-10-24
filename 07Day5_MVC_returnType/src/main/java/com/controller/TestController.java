package com.controller;

import java.util.ArrayList;

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

	@RequestMapping(value = "/aaa", method=RequestMethod.GET)
	public String aaa() {
		return "main";
	}

	@RequestMapping(value = "/bbb", method=RequestMethod.GET)
	public ModelAndView bbb() {
	    System.out.println("bbb=============");
	    ModelAndView mav= new ModelAndView();
	    mav.addObject("username", "홍길동");
	    mav.setViewName("main2");
		return mav;
	}
	@RequestMapping(value = "/ccc", method=RequestMethod.GET)
	public LoginDTO xxx(){
		System.out.println("/ccc ================");
		LoginDTO dto = new LoginDTO();
		dto.setUserid("홍길동");
		dto.setPasswd("1234");
		return dto;
	}
	
	@RequestMapping(value = "/ddd", method=RequestMethod.GET)
	@ModelAttribute("xxx")
	public LoginDTO xxx2(){
		System.out.println("/ddd ================");
		LoginDTO dto = new LoginDTO();
		dto.setUserid("홍길동");
		dto.setPasswd("1234");
		return dto;
	}

	@RequestMapping(value = "/eee", method=RequestMethod.GET)
	@ModelAttribute("yyy")
	public ArrayList<String> eee(){
		System.out.println("/eee ================");
		ArrayList<String> list= new ArrayList<String>();
		list.add("홍길동1");
		list.add("홍길동2");
		list.add("홍길동3");
	
		return list;
	}
	@RequestMapping(value = "/fff", method=RequestMethod.GET)
	public void fff(HttpServletRequest request) {
		request.setAttribute("username", "홍길동");
		System.out.println("/fff============");
	}

	@RequestMapping(value = "/ggg", method=RequestMethod.GET)
	public void fff(Model m) {
		m.addAttribute("username", "홍길동");
		System.out.println("/ggg============");
	}
	
}
