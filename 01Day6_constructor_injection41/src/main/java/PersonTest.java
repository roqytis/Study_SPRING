import org.springframework.context.support.GenericXmlApplicationContext;

import com.spring.Cat;
import com.spring.Dog;
import com.spring.Person;

public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GenericXmlApplicationContext ctx= new GenericXmlApplicationContext("com/spring/person.xml");
		
		Person p= ctx.getBean("one",Person.class);
		System.out.println(p);
		
		Cat cat=p.getCat();
		Dog d=p.getDog();
		System.out.println(cat+"\t"+d);
		
		Cat c=(Cat)ctx.getBean("catBean");
		System.out.println(c.getCatAge());
	}

}
