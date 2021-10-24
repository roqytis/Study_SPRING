import org.springframework.context.support.GenericXmlApplicationContext;

import com.spring.Cat;
import com.spring.Person;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GenericXmlApplicationContext ctx= new GenericXmlApplicationContext("config.xml");
		Person p=ctx.getBean("oneperson", Person.class);
		Cat c= p.getCat();
		System.out.println(c.getCatName()+"\t"+c.getCatAge());
		System.out.println(p);
	}

}
