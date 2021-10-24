package com.spring;

public class Person {
//기본 생성자 없음
	String name;
	public Person(String x) {
		super();
		System.out.println("person 생성자 호출"+x);
		this.name=x;
	}

	public String getInfo() {
		return name;
	}
}
