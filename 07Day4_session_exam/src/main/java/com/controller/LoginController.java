package com.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.dto.LoginDTO;

@Controller
public class LoginController {

	@RequestMapping(value = "/main", method = RequestMethod.GET)
	public String main() {
		System.out.println("loginForm 호출됨======");
		return "main";
	}
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String loginForm() {
		System.out.println("loginForm 호출됨======");
		return "loginForm";
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(LoginDTO dto,HttpSession session) {
		LoginDTO mdto=(LoginDTO)session.getAttribute("member");
		System.out.println("/login post session dto===="+ dto);
		String nextPage=" ";
		if (mdto!= null) {
			System.out.println("memberDTO.id :" +mdto.getUserid());
			if (mdto.getUserid().equals(dto.getUserid())&&
					mdto.getPasswd().equals(dto.getPasswd())
					) {
				session.setAttribute("login", dto);
				nextPage="logined";
			}else {
				System.out.println("id가 없음");
			  nextPage="redirect:login";
			}
		}else {
			System.out.println("회원가입 정보가 없습니다.");
			nextPage="redirect:login";
			}
		return nextPage;
		}
		
	@RequestMapping(value = "/logout", method= RequestMethod.GET)
	public String logout(HttpSession session) {
		session.invalidate(); //세션완전 삭제
		return "redirect:login"; // login get방식 다시 요청
		//return "loginForm"; // login get방식 다시 요청
		//컨트롤러에 부탁하는거임
		//response.sendRedirect("login"); // 매핑 주소를 다시 찾아가서 request를 다시 요청함
	}
	
	////////////////////// 회원가입 정보 
	@RequestMapping(value = "/member", method =RequestMethod.GET)
	public String memberJoin() {
		System.out.println("/member get=====");
		return "memberForm";
	}

	@RequestMapping(value = "/member", method =RequestMethod.POST)
	public String memberJoin(LoginDTO dto, HttpSession session) {
		System.out.println("/member post====="+dto);
		session.setAttribute("member", dto);
		return "redirect:main";
	}
	
	
}
