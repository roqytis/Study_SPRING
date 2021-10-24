package com.spring;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.Service.OneService;
import com.Service.TwoService;
import com.bean.EchoBean;

public class EchoBeanTest {

	public static void main(String[] args) {
		GenericXmlApplicationContext ctx=
				new GenericXmlApplicationContext("echo.xml");
		EchoBean service=ctx.getBean("echoBean", EchoBean.class);
		
		OneService one= service.getOne();
		TwoService two=service.getTwo();
		one.one();
		two.two();

	}

}
