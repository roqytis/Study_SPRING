package com.spring;

import org.springframework.context.support.GenericXmlApplicationContext;

public class TestStudent {

	public static void main(String[] args) {
		
		GenericXmlApplicationContext ctx=
				new GenericXmlApplicationContext("echo.xml");
		EchoBean echo=ctx.getBean("EchoBean",EchoBean.class);
		AnotherBean anothoer=echo.getXxx();
		System.out.println(anothoer.getName()+"\t"+anothoer.getAge());

	}

}
