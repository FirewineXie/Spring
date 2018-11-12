package com.spring.spel;

import javax.swing.text.AbstractDocument.Content;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("beans_spel.xml");
	
		Address address = (Address)context.getBean("address");
		System.out.println(address);
	
		
		Car car = (Car)context.getBean("car");
		System.out.println(car);
		
		Person person = (Person) context.getBean("person");
		System.out.println(person);
	}

}
