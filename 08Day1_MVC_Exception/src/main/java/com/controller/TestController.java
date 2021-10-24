package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
    @RequestMapping(value = "/aaa")
	public String xxx() {
		if (true)throw new ArithmeticException("ArithmeticException발생==================");
		return "main";
	}
    @RequestMapping(value = "/bbb")
    public String bbb() {
    	if (true)throw new NullPointerException("NullPointerException발생==================");
    	return "main";
    }
    @ExceptionHandler({ArithmeticException.class, NullPointerException.class})
    public String errorPage() {
    	return "error";
    }
}
