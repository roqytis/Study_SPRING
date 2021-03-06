package com.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.dto.LoginDTO;

@Controller
public class TestController {
	
	
	//http://localhost:8090/app1/login  으로 시작 , loginForm수정하면서 테스트
	
	  @RequestMapping(value = "/loginForm", method = RequestMethod.GET) public String
	  loginForm() { System.out.println("/login get"); return "loginForm"; }
	  //loginForm.jsp }
	 
		
		
		//http://localhost:8090/app1/login   post  객체 직접생성 전송
		@RequestMapping(value = "/login", method = RequestMethod.GET)
		public String login1(LoginDTO dto) {//form데이터를 자동으로 dto에 저장
			System.out.println("/login post, "+dto);
			return "login";//login.jsp 
		}
		
		//http://localhost:8090/app1/login2   loginForm.jsp 수정 
		@RequestMapping(value = "/login2")
		public String login2(@RequestParam("userid") String id, 
				@RequestParam("passwd") String pw) {
			System.out.println("(@RequestParam(\"userid\")"+id+ "@RequestParam(\"passwd\")"+pw);
			return "login";
		}	
		
		
		//http://localhost:8090/app1/login3   loginForm.jsp 수정 
		@RequestMapping(value = "/login3")
		public String login3(@RequestParam String userid, @RequestParam String passwd) {
			System.out.println("@RequestParam String userid, @RequestParam String password"+
					userid+"\t" +passwd
					);
			return "login";
		}
		
		
		
		//http://localhost:8090/app1/login4   loginForm.jsp 수정 
		@RequestMapping(value = "/login4")
		public String login4( String userid,  String passwd) {
			System.out.println("/login4 String userid,  String password"+
					userid+"\t" +passwd
					);
			return "login";
		}
		
		
		
		
		
		
		
		//http://localhost:8090/app1/login5   loginForm.jsp 수정 
		//값중 하나라도 없을 경우 405에러 발생시 아래 같은 방법으로 회피함
		@RequestMapping(value = "/login5")
		public String login5(@RequestParam(required = false, defaultValue = "홍길동")
		String xxx, String passwd) {//userid 다른 변수로 사용 
			System.out.println("/login5 @RequestParam(required = false, defaultValue = \"홍길동\")"+
					xxx+"\t" +passwd
					);
			return "login";
		}
		
		
		
		
		//http://localhost:8090/app1/login6   loginForm.jsp 수정 
		@RequestMapping(value = "/login6")
		public String login6(@RequestParam Map<String, String> m) {
			System.out.println("/login6 @RequestParam Map<String, String> m"+
					m
					);
			System.out.println(m.get("userid")+"\t"+ m.get("passwd"));
			return "login";
		}
	//  key=userid, value="abcd", key="passwd", value="1234"


	
	 

}
