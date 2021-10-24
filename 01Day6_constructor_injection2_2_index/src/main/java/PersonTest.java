import org.springframework.context.support.GenericXmlApplicationContext;

import com.spring.Person;

public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    GenericXmlApplicationContext ctx= new GenericXmlApplicationContext("com/spring/person.xml");
		/*
		 * Person xxx=ctx.getBean("xxx", Person.class);
		 * System.out.println(xxx.getInfo()); }
		 */
	Person xxx3=ctx.getBean("xxx3", Person.class);
	System.out.println(xxx3.getInfo());
}

}
