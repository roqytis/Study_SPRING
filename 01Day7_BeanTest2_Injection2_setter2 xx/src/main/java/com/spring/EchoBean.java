package com.spring;

public class EchoBean {

	AnotherBean xxx;
    
	public EchoBean() {//기본생성자
	 System.out.println("기본 생성자");
	}
	public String sayEcho() {
		return "hello";
	}
	

	public AnotherBean getXxx() {
		return xxx;
	}
	public void setXxx(AnotherBean xxx) {
		this.xxx = xxx;
	}
	
}
