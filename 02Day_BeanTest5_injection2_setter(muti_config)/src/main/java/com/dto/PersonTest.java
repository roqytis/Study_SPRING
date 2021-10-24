package com.dto;

import org.springframework.context.support.GenericXmlApplicationContext;

public class PersonTest {

	public static void main(String[] args) {
		
		GenericXmlApplicationContext ctx=new GenericXmlApplicationContext("echo1.xml","echo2.xml");
		
		Person p1=ctx.getBean("onePerson", Person.class);
		//Person p2=ctx.getBean("onePerson", Person.class);
		//System.out.println(p1==p2);
		System.out.println(p1);
	}

}
