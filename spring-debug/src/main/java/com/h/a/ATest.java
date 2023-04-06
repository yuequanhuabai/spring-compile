package com.h.a;






import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

public class ATest {


	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		System.out.println("compile spring source start ....");
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Object a = context.getBean("a");

		System.out.println("===========");

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
