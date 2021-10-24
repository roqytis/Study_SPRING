package com.spring;

import org.springframework.context.support.GenericXmlApplicationContext;

public class TestStudent {

	public static void main(String[] args) {
		
		GenericXmlApplicationContext ctx=
				new GenericXmlApplicationContext("echo.xml");
		EchoBean echo=ctx.getBean("echoBean",EchoBean.class);
		System.out.println(echo.getName());

	}

}
