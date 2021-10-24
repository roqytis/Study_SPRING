package com.spring;

public class Person {

	private String usename;
	Cat cat;
	Dog dog;
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(String usename, Cat cat, Dog dog) {
		super();
		this.usename = usename;
		this.cat = cat;
		this.dog = dog;
	}
	public String getUsename() {
		return usename;
	}
	public void setUsename(String usename) {
		this.usename = usename;
	}
	public Cat getCat() {
		return cat;
	}
	public void setCat(Cat cat) {
		System.out.println("set============");
		this.cat = cat;
	}
	public Dog getDog() {
		return dog;
	}
	public void setDog(Dog dog) {
		this.dog = dog;
	}
	@Override
	public String toString() {
		return "Person [usename=" + usename + ", cat=" + cat + ", dog=" + dog + "]";
	}
	
}
