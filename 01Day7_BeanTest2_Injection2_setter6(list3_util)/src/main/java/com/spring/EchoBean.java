package com.spring;

import java.util.List;

public class EchoBean {
     List<AnotherBean> valueList;
     AnotherBean  anotherBean;
	public EchoBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EchoBean(AnotherBean anotherBean) {
		super();
		
		this.anotherBean = anotherBean;
	}
	public List<AnotherBean> getValueList() {
		return valueList;
	}
	public void setValueList(List<AnotherBean> valueList) {
		this.valueList = valueList;
	}
	public AnotherBean getAnotherBean() {
		return anotherBean;
	}
	public void setAnotherBean(AnotherBean anotherBean) {
		this.anotherBean = anotherBean;
	}
	@Override
	public String toString() {
		return "EchoBean [valueList=" + valueList + ", anotherBean=" + anotherBean + "]";
	}

	
     
     
}
