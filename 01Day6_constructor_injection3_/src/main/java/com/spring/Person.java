package com.spring;

public class Person {
      String username;
      int age;
	
      public Person(String username,int age) {
		super();
		System.out.println("생성자 호출"+username+"\t"+age);
		this.username =username;
		this.age= age;
	}
      
      public String getInfo() {
    	  return "홍길동";
      }

	@Override
	public String toString() {
		return "Pesron [username=" + username + ", age=" + age + "]";
	}
      
}
