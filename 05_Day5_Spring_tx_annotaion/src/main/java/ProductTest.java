import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.entity.OrderDTO;
import com.entity.ProductDTO;
import com.service.ProductService;


public class ProductTest {

	public static void main(String[] args) {
		
		GenericXmlApplicationContext ctx =
				new GenericXmlApplicationContext("classpath:dept.xml");		
		ProductService service = ctx.getBean("deptService", ProductService.class);

		List<ProductDTO> list = service.selectProduct();
		for (ProductDTO dto : list) {
			System.out.println(dto);
		}	
		// 상품 주
		System.out.println("p01 상품 5개 주문합니다");
		try {
			service.addOrder("p01", 5);//add시 문제 발생  
			//T_ORDER에 INSERT, T_product update =>에러 발생 롤백
			//T_order에 인서트 확인 할 것 
		//
		} catch (Exception e) {
			System.out.println("에러가 발생하여 롤백처리.");
		}
		
		list = service.selectProduct();
		for (ProductDTO dto : list) {
			System.out.println(dto);
		}
		
		List<OrderDTO> oList = service.selectOrder();
		for (OrderDTO dto : oList) {
			System.out.println(dto);
		}
	
	}//end main

}//end class
