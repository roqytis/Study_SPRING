import java.util.List;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.dao.DeptDAO;
import com.service.DeptService;

public class DeptMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GenericXmlApplicationContext ctx= new GenericXmlApplicationContext("com/spring/config.xml");

		
		/*
		 * DeptService service= ctx.getBean("deptService", DeptService.class);
		 * List<String> list= service.getList(); //service.getList()=> dao.getList()호출
		 * System.out.println(list);
		 */
		 
		
	}

}
