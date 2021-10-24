import org.springframework.context.support.GenericXmlApplicationContext;

public class Person {

	public static void main(String[] args) {
		
		GenericXmlApplicationContext ctx= new GenericXmlApplicationContext("com/spring/person.xml");
		
     
		Person xxx=ctx.getBean("xxx",Person.class);
		System.out.println(xxx.toString());
	}

}
