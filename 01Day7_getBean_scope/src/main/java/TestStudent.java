import org.springframework.context.support.GenericXmlApplicationContext;

import com.dto.Student;

public class TestStudent {

	public static void main(String[] args) {
	
		GenericXmlApplicationContext ctx= new GenericXmlApplicationContext("com/config/student.xml");
		Student a=ctx.getBean("stu",Student.class);
		Student b=ctx.getBean("stu",Student.class);
		
	//	System.out.println("a==a");
		
		System.out.println(b);
		System.out.println(a);
		System.out.println(a==b);
		
	//	Student c=ctx.getBean("stu2",Student.class);
	//	System.out.println(a==c);
	}

}
