import java.util.List;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.service.DeptService;

public class DeptMain {

	public static void main(String[] args) {
		GenericXmlApplicationContext ctx=
				new GenericXmlApplicationContext("com/config/config.xml");
		DeptService service=ctx.getBean("deptService", DeptService.class);
		List<String> list =service.getList();
		for (String s : list) {
			System.out.println(s);
		}

	}

}
