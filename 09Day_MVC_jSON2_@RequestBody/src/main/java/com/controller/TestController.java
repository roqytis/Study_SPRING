package com.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dto.Login;

@Controller
public class TestController {

	@RequestMapping("/aaa")
	public String aaa(@RequestBody Login login) {
		System.out.println(login);
		return "main";
	}
	@RequestMapping("/bbb")
	public String bbb(@RequestBody ArrayList<Login> list) {
		System.out.println(list);
		return "hello";
	}
	@RequestMapping("/ccc")
	public String ccc(String userid, String passwd) {
		System.out.println(userid+"\t"+passwd);
		return "main";
	}
}
