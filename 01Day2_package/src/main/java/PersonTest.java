import org.springframework.context.support.GenericXmlApplicationContext;

import com.spring.Person;

public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GenericXmlApplicationContext ctx= new GenericXmlApplicationContext("classpath:person.xml");
		
		Person p1= ctx.getBean("yyy", Person.class);
		System.out.println(p1.getInfo());
		
		Person p2=(Person)ctx.getBean("yyy");
		System.out.println(p2.getInfo());
		
	}

}
