import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("bean1.xml");
		TestUse d=(TestUse) context.getBean("akhila");
		System.out.println(d.toString());

	}

}
