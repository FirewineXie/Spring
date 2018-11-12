package com.spring.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		
		
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Person person3 = (Person) context.getBean("person3");
		System.out.println(person3);
		
		
		NewPerson newperson = (NewPerson) context.getBean("newperson");
		System.out.println(newperson);
	
		
//		DataSource dataSource = context.getBean(DataSource.class);
//		System.out.println(dataSource);

		
		Person person4 = (Person) context.getBean("person4");
		System.out.println(person4);
		

		Person person5 = (Person) context.getBean("person5");
		System.out.println(person5);
	}
}
