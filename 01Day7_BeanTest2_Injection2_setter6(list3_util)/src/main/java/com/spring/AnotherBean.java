package com.spring;

public class AnotherBean {
   String name;

public AnotherBean() {
	super();
	// TODO Auto-generated constructor stub
}

public AnotherBean(String name) {
	super();
	this.name = name;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

@Override
public String toString() {
	return "AnotherBean [name=" + name + "]";
}
   
	
}
