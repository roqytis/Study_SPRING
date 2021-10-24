package com.spring;

public class Person {

	public Person(String x) {
		super();
		System.out.println("1.person 생성자 호출"+x);
	}
	public Person(String x, String y) {
		super();
		System.out.println("2.person 생성자 호출 x,y"+x+"\t"+y);
	}
	public Person(String xx, int yy) {
		super();
		System.out.println("3.person 생성자 호출 xx,yy"+xx+"\t"+yy);
	}
	public String getInfo() {
		return "홍길동";
	}

}
