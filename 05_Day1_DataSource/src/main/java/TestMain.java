import java.util.ArrayList;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.dao.TestDAO;
import com.dto.TestDTO;

public class TestMain {

	public static void main(String[] args) {
		//DataSourc만을 이용한 db접속 
		  GenericXmlApplicationContext ctx= new
		  GenericXmlApplicationContext("classpath:com/config/config.xml"); 
		  TestDAO	 dao=ctx.getBean("dao", TestDAO.class); //config.xml에 TestDAo 빈생성 코드 넣을 것 
		  ArrayList<TestDTO> list= dao.select();
		  for (TestDTO s : list) { System.out.println(s); }
		
	}

}
