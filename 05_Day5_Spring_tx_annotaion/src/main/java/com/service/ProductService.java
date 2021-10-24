package com.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.dao.ProductDAO;
import com.entity.OrderDTO;
import com.entity.ProductDTO;

public class ProductService {

	ProductDAO dao;
	
	//占쏙옙瞿占쏙옙占�
	public List<ProductDTO> selectProduct(){
		return dao.selectProduct();
	}
	
	@Transactional   //tx처리함  필요함수 위에 붙여줌- 함수 단위 처리를 해주고 자동 rollback, commit까지 해줌 
	public void addOrder(String pcode, int quantity) throws Exception{
		dao.addOrder(pcode, quantity);
	}

	public ProductDAO getDao() {
		return dao;
	}

	public void setDao(ProductDAO dao) {
		this.dao = dao;
	}
	
	

	
	public List<OrderDTO> selectOrder() {
		return dao.selectOrder();
	}
	//특占쏙옙 占쏙옙占쌘듸옙 


	
	//占쏙옙占쌘듸옙 占쏙옙占쏙옙
	public void update(int deptno, String dname, String loc){
		dao.update(deptno, dname, loc);
	}
	
	//占쏙옙占쌘듸옙 占쏙옙占쏙옙
	public void delete(int deptno){
		dao.delete(deptno);
	}
	
}
