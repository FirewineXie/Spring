package com.spring.scope;


import com.spring.autowire.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans_scope.xml");
		
		Car car =(Car) context.getBean("car");
		Car car2 = (Car) context.getBean("car");
		
		System.out.println(car == car2);
	}

}
