package com.bean;

import com.Service.OneService;
import com.Service.TwoService;

public class EchoBean {

	OneService one;
	TwoService two;
	public EchoBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public OneService getOne() {
		return one;
	}
	public void setOne(OneService one) {
		this.one = one;
	}
	public TwoService getTwo() {
		return two;
	}
	public void setTwo(TwoService two) {
		this.two = two;
	}
	public EchoBean(OneService one, TwoService two) {
		super();
		this.one = one;
		this.two = two;
	}
	@Override
	public String toString() {
		return "EchoBean [one=" + one + ", two=" + two + "]";
	}
	
}
