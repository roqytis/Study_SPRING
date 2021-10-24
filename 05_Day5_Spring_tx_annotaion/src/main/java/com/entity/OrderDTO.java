package com.entity;

/*
 *    create table t_order
   ( num number(4) primary key,
     pcode  varchar2(10) references product(pcode),
     quantity number(4) ); 
 */
public class OrderDTO {

	  int num;
	  String pcode;
	  int qnantity;
	  

	@Override
	public String toString() {
		return "OrderDTO [num=" + num + ", pcode=" + pcode + ", qnantity="
				+ qnantity + "]";
	}
	public OrderDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public OrderDTO(int num, String pcode, int qnantity) {
		super();
		this.num = num;
		this.pcode = pcode;
		this.qnantity = qnantity;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getPcode() {
		return pcode;
	}
	public void setPcode(String pcode) {
		this.pcode = pcode;
	}
	public int getQnantity() {
		return qnantity;
	}
	public void setQnantity(int qnantity) {
		this.qnantity = qnantity;
	}
	  
	  
	  
	  
	  
}
