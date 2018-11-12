package com.spring.factory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("beans_factory.xml");
		
		
		Car car1 = (Car) context.getBean("car1");
		System.out.println(car1);
		Car car2 = (Car) context.getBean("car2");
		System.out.println(car2);
		
	}

}
