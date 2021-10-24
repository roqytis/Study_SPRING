package com.spring;

public class Dog {
String Dogname;

public String getDogname() {
	return Dogname;
}

public void setDogname(String dogname) {
	Dogname = dogname;
}

@Override
public String toString() {
	return "Dog [Dogname=" + Dogname + "]";
}


}
