import java.util.List;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.dao.DeptDAO;
import com.service.DeptService;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GenericXmlApplicationContext ctx= new GenericXmlApplicationContext("com/spring/config.xml");

		DeptService service= ctx.getBean("deptService", DeptService.class);
		List<String> list= service.getList();
		System.out.println(list);
		
	}

}
