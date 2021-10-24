package com.dto;

public class Student {

	String name="aaa";
	int age= 10;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("Student 생성자 호출");
	}
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "student [name=" + name + ", age=" + age + "]";
	}

}
