package com.service;

import java.util.List;

import com.dao.DeptDAO;

public class DeptService {

	public DeptDAO dao;// 선언
	public DeptService(DeptDAO dao) {// 생성자를 통한 주입
		this.dao=dao;
	}
	public List<String>getList(){
		return dao.getList();
	}
}
