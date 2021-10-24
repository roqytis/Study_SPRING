package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TestController {
@RequestMapping("/")
	public String main() {
		System.out.println("TestCOntroller.main  /");
		return "login";
	}
@RequestMapping(value = "/login", params="aaa=bbb")
public String loginForm() {
	System.out.println("TestCOntroller.main  /");
	return "login";
}
@RequestMapping(value = "/login")
public String loginForm2() {
	System.out.println("TestCOntroller.main  /");
	return "login";
}
@RequestMapping(value = "/login", params="aaa=ccc")
public String login() {
	System.out.println("TestCOntroller.main  /");
	return "login";
}
   //http://localhost:8088/test_1/login?xxx
   //http://localhost:8088/test_1/login?xxx=아무값
@RequestMapping(value = "/login", params="xxx")
public String login2() {
	System.out.println("TestCOntroller.main  /");
	return "login";
}
@RequestMapping(value = "/login", params="kkk=b")
public String x() {
	System.out.println("TestCOntroller.main  /");
	return "login";
}
@RequestMapping(value = "/login", params="kkk=c")
public String y() {
	System.out.println("TestCOntroller.main  /");
	return "login";
}
// yyy가 아닌 모든것
	/*
	 * @RequestMapping(value = "/login", params="!yyy") public String login3() {
	 * System.out.println("TestCOntroller.main  /"); return "login"; }
	 */
}
