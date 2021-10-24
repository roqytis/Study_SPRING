package com.spring;

import org.springframework.beans.factory.annotation.Autowired;

public class Person {

	String username;
	int age;
	//***************************************************************//
	@Autowired(required = false) //자동주입 byType와 동일
    Cat cat;
  //***************************************************************//
    
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(String username, int age, Cat cat) {
		super();
		this.username = username;
		this.age = age;
		this.cat = cat;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Cat getCat() {
		return cat;
	}
	public void setCat(Cat cat) {
	 System.out.println("Person.setCat함수호출()=============");
		this.cat = cat;
	}
	@Override
	public String toString() {
		return "Pesron [username=" + username + ", age=" + age + ", cat=" + cat + "]";
	}
    
}
