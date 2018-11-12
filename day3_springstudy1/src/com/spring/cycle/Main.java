package com.spring.cycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans_cycle.xml");
		
		Car  car = (Car) context.getBean("car");
		System.out.println(car);
	
	
		//关闭IOC容器
		context.close();
	}

}
