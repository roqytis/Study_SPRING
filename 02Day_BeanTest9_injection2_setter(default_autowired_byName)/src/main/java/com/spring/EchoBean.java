package com.spring;

import java.util.List;

public class EchoBean {

	private List valueList;
	private AnotherBean anotherBean;
	public EchoBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EchoBean( AnotherBean anotherBean) {
		System.out.println("ㄸ쵀ㅠㄸ무(another bean) 생성자 호출");
	
		this.anotherBean = anotherBean;
	}
	public List getValueList() {
		return valueList;
	}
	public void setValueList(List valueList) {
		this.valueList = valueList;
	}
	public AnotherBean getAnotherBean() {
		System.out.println("EchoBean(AnotherBean anotherBean)생성자 호출");
		return anotherBean;
	}
	public void setAnotherBean(AnotherBean anotherBean) {
		System.out.println("EchoBean.ㄴㄷㅅ무ㅐ솓귣무(AnotherBean anotherBean)호출=="+anotherBean);
		this.anotherBean = anotherBean;
	}
	@Override
	public String toString() {
		return "EchoBean [valueList=" + valueList + ", anotherBean=" + anotherBean + "]";
	}
	
}
