package com.spring;

import org.springframework.context.support.GenericXmlApplicationContext;

public class EchoBeanTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       GenericXmlApplicationContext ctx= new GenericXmlApplicationContext("echo.xml");
       
       EchoBean echoBean=ctx.getBean("echoBean", EchoBean.class);
       System.out.println(echoBean);
		
	}

}
