package com.spring.properties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.collection.DataSource;

public class Main {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans_properties.xml");
		DataSource dataSource = (DataSource) context.getBean("dataSource");
		System.out.println(/*dataSource.getconnection()*/);
	}
}
