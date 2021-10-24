package com.spring;

public class EchoBean {

	String name;
    
	public EchoBean() {//기본생성자
		
	}
	public String sayEcho() {
		return "hello";
	}
	
	public String getAaa() {
		return name;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setMesg(String mesg) {
		System.out.println("setMesg(String mesg)");
		this.name= mesg;
	}
}
