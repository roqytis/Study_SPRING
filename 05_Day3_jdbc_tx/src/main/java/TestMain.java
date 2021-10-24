import java.util.ArrayList;

import org.springframework.context.support.GenericXmlApplicationContext;

public class TestMain {

	public static void main(String[] args) {
		/*
		 * GenericXmlApplicationContext ctx= new
		 * GenericXmlApplicationContext("classpath:Test.xml"); TestDAO
		 * dao=ctx.getBean("dao", TestDAO.class); ArrayList<TestDTO> list= dao.select();
		 * for (TestDTO s : list) { System.out.println(s); }
		 */
		TestDAO dao= new TestDAO();
		dao.insert(10, "pppp", "pppp");
		
		
		ArrayList<TestDTO> list= dao.select();
		 for (TestDTO dto : list) { 
			 System.out.println(dto);
			 }
		
	}

}
