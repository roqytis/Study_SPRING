package com.member.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.DetpDAO;
import com.dto.DeptDTO;

@Service  // component-scan 자동생성
public class MemberService {
	@Autowired
	DetpDAO dao;

	public List<DeptDTO> list(){
		return dao.list();
	}

	public void add(DeptDTO dto) {
	dao.add(dto);
		
	}

	
	
	
	
	
	
	
	
	public void del(int deptno) {
		dao.del(deptno);
		
	}

	public void update(DeptDTO dto) {
		dao.update(dto);
		
	}

}
