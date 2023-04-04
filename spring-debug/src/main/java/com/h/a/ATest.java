package com.h.a;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ATest {

	public static void main(String[] args) {
		System.out.println("hello world!");
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Object a = context.getBean("a");

		Class<?> aClass = a.getClass();
		System.out.println(a);
		System.out.println("=========");
	}
}
