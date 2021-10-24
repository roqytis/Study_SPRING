package com.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.entity.OrderDTO;
import com.entity.ProductDTO;


/*
 
   -- 상품테이블
  drop table t_order purge;
  drop table t_product  purge;

   create table t_product
   ( pcode  varchar2(10) primary key,
     pname varchar2(10),
     price number(4),
     quantity number(4) );
     
     
   -- 주문 테이블   
   create table t_order
   ( num number(4) primary key,
     pcode  varchar2(10) references product(pcode),
     quantity number(4) ); 
     
   create sequence t_order_seq;
    
   insert into t_product( pcode,pname,price,quantity) values ( 'p01','TV',1000, 10 );
   insert into t_product( pcode,pname,price,quantity) values ( 'p02','iPhone',500, 5 );
   insert into t_product( pcode,pname,price,quantity) values ( 'p03','G3',600, 20 );
    
   commit;

 
 */







public class ProductDAO {

	private JdbcTemplate jdbcTemplate;
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

/////////////////////////////////////////

    // 전체 상품 목록
	public List<ProductDTO> selectProduct() {

		String query = "select * from t_product order by pcode";
		return jdbcTemplate.query(query, new RowMapper<ProductDTO>() {

			@Override
			public ProductDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
				ProductDTO dto = new ProductDTO();
				dto.setPcode(rs.getString("pcode"));
				dto.setPname(rs.getString("pname"));
				dto.setPrice(rs.getInt("price"));
				dto.setQuantity(rs.getInt("quantity"));
				return dto;
			}

		});

	}// end select

	 // 전체 주문 목록
		public List<OrderDTO> selectOrder() {

			String query = "select * from t_order order by pcode";
			return jdbcTemplate.query(query, new RowMapper<OrderDTO>() {
				@Override
				public OrderDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
					OrderDTO dto = new OrderDTO();
					 dto.setNum(rs.getInt("num"));
					 dto.setPcode(rs.getString("pcode"));
					 dto.setQnantity(rs.getInt("quantity"));
					return dto;
				}
			});
		}// end select
	
	// 주문
	public void addOrder(String pcode, int quantity) throws Exception{

		String sql = "insert into t_order ( num, pcode, quantity ) values ( t_order_seq.nextval, ? , ? )";

		int n = jdbcTemplate.update(sql, pcode, quantity);
//오더데이블에 insert후 
		//String sql2 = "update t_product set  quantity = quantity - ? , where pcode = ?";
		String sql2 = "up t_product set  quantity = quantity - ? , where pcode = ?";
		//update쿼리를 잘못 작성하여 에러를 발생시킴  수량감소
		int n2= jdbcTemplate.update(sql2 , quantity, pcode );

	}// end insert

	// 占쏙옙占쌘듸옙 占쏙옙占쏙옙
	public void update(int deptno, String dname, String loc) {

		String sql = "update dept set dname = ? , loc = ? where deptno = ?";

		int n = jdbcTemplate.update(sql, new Object[] { dname, loc, deptno },
				new int[] { Types.VARCHAR, Types.VARCHAR, Types.INTEGER });

	}// end update

	// 占쏙옙占쌘듸옙 占쏙옙占쏙옙
	public void delete(int deptno) {

		String sql = "delete from dept where deptno = ?";
		int n = jdbcTemplate.update(sql, deptno);
	}// end delete


}
