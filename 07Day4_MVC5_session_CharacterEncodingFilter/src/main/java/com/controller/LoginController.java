package com.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.dto.LoginDTO;

@Controller
public class LoginController {

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String loginForm() {
		System.out.println("loginForm 호출됨======");
		return "loginForm";
	}
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(LoginDTO dto,HttpSession session) {
		System.out.println("login1.post======"+dto);
		if (session.getAttribute("login")==null) {
			session.setAttribute("login", dto);	
		}
	return "login"; //key 소문자로 시작하는 클라스 이름
	}
	
	@RequestMapping(value = "/logout", method= RequestMethod.GET)
	public String logout(HttpSession session) {
		session.invalidate(); //세션완전 삭제
		return "redirect:login"; // login get방식 다시 요청
		//return "loginForm"; // login get방식 다시 요청
		//컨트롤러에 부탁하는거임
		//response.sendRedirect("login"); // 매핑 주소를 다시 찾아가서 request를 다시 요청함
	}
}
