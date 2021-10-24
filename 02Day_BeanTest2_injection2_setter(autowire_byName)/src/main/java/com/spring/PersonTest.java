package com.spring;

import org.springframework.context.support.GenericXmlApplicationContext;

public class PersonTest {

	public static void main(String[] args) {
		
		GenericXmlApplicationContext ctx=new GenericXmlApplicationContext("person.xml");
		
		Person p1=ctx.getBean("onePerson", Person.class);
		System.out.println(p1.getCat()+"\t"+p1.getDog());
	}

}
