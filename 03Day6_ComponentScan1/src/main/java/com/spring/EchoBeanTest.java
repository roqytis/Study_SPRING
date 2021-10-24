package com.spring;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.service.DeptService;

public class EchoBeanTest {

	public static void main(String[] args) {
		
		GenericXmlApplicationContext ctx=
				new GenericXmlApplicationContext("echo.xml");
		DeptService service1=ctx.getBean("deptService", DeptService.class);
		
		System.out.println(service1.getService());
	}

}
