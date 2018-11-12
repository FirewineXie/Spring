package com.spring.FactoryBean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans_beanfactory.xml");
		
		Car car = (Car) context.getBean("car");
		
		
		System.out.println(car);
		
	}

}
