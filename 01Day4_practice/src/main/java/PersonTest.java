import org.springframework.context.support.GenericXmlApplicationContext;

import com.spring.Animal;
import com.spring.Person;

public class PersonTest {

	public static void main(String[] args) {
		
		GenericXmlApplicationContext ctx= new GenericXmlApplicationContext("com/kkk/*.xml");
		
		
		Person p1= ctx.getBean("xxx", Person.class);
		System.out.println(p1.getInfo());
		//Person p2=(Person)ctx.getBean("xxx");
		//System.out.println(p2.getInfo());
	  
		
		//Animal a1= ctx.getBean("yyy",Animal.class);
	    //System.out.println(a1.getName());
	    Animal a2=(Animal)ctx.getBean("yyy");
	    System.out.println(a2.getName());
	}

}
