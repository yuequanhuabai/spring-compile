package com.h.a;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ATest {


	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		System.out.println("compile spring source start ....");
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//		A a = (A)context.getBean("a");

//		Person person = (Person)context.getBean("person");
//		System.out.println(person.getId());
//		System.out.println(person.getName());

		AFactoryBean aFactoryBean = (AFactoryBean)context.getBean("&aFactoryBean");
		A a = (A) context.getBean("aFactoryBean");


//		Map<String, String> getenv = System.getenv();
//		Properties properties = System.getProperties();
//		System.out.println("getenv: "+ getenv);
//		System.out.println("properties: "+ properties);;

		String id = a.getId();
		System.out.println("id:  "+id);
		System.out.println("a:"+a);
		System.out.println("==========="+a);

		//  web 端获取

//		ServletContext sc =request.getSession().getServletContext();

//		WebApplicationContext requiredWebApplicationContext = WebApplicationContextUtils.getRequiredWebApplicationContext(null);
//		WebApplicationContext webApplicationContext = WebApplicationContextUtils.getWebApplicationContext(null);

//		Resource resource =new ClassPathResource("applicationContext.xml");
//
//		BeanFactory factory = new XmlBeanFactory(resource);
//
//		Object a1 = factory.getBean("a");
//
//		System.out.println("a 和 a1 是否相等？");
//		System.out.println(a1.equals(a));

	}



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
