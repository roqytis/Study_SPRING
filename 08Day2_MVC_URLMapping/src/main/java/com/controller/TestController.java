package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TestController {

	@RequestMapping(value = "/", method=RequestMethod.GET)
	public String main() {
		return "main";
	}
	
	@RequestMapping(value = "/aaa", method=RequestMethod.GET)
	public String aaa() {
		System.out.println("aaa호출=====");
		return "main";
	}

	@RequestMapping(value = {"/aaa2","/aaa3"}, method=RequestMethod.GET)
	public String aaa2() {
		System.out.println("aaa2, aaa3 호출=====");
		return "main";
	}

	@RequestMapping(value = "/bbb*", method=RequestMethod.GET)
	public String aaa3() {
		System.out.println("aaa3=====");
		return "main";
	}

	@RequestMapping(value = "/ccc/*", method=RequestMethod.GET)
	public String aaa4() {
		System.out.println("aaa4 호출=====");
		return "main";
	}

	@RequestMapping(value = "/ddd/**", method=RequestMethod.GET)
	public String aaa5() {
		System.out.println("aaa5 호출=====");
		return "main";
	}
	
	@RequestMapping(value = "/eee/**/aaa", method=RequestMethod.GET)
	public String aaa6() {
		System.out.println("aaa6 호출=====");
		return "main";
	}

	@RequestMapping(value = "/hhh/{userid}/xxx/{passwd}", method=RequestMethod.GET)
	public String aaa7(@PathVariable("userid") String userid,
			@PathVariable("passwd") String passwd) {
		System.out.println("aaa7 호출=====");
		System.out.println(userid+"\t"+passwd);
		return "main";
	}
	
	
}
