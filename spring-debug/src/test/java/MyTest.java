import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {

	@SuppressWarnings("deprecation")
	@Test
	public void test(){

		System.out.println("compile spring source start ....");
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Object a = context.getBean("a");

		System.out.println("===========");

//
//		Resource resource =new ClassPathResource("applicationContext.xml");
//
//		BeanFactory factory = new XmlBeanFactory(resource);
//
//		Object a1 = factory.getBean("a");
//
//		System.out.println("a 和 a1 是否相等？");
//		System.out.println(a1.equals(a));

	}

}
