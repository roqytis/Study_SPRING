package com.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dto.DeptDTO;

@Repository  // component-scan 자동빈생성 
public class DetpDAO {
	@Autowired
	SqlSessionTemplate session;

	public List<DeptDTO> list(){
		return session.selectList("DeptMapper.list");
	}

}
