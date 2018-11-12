package com.spring.aop.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-xml.xml");
		ArithmeticCalculator arithmeticCalculator = (ArithmeticCalculator) context.getBean("arithmeticCalculator");
		
		int result = arithmeticCalculator.add(1, 2);
		System.out.println("result " + result);
		
		result = arithmeticCalculator.div(1000, 200);
		System.out.println("result " + result);
	}

}
