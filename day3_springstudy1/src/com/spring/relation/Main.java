package com.spring.relation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.autowire.Address;
import com.spring.autowire.Person;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("beans_relation.xml");
		
		Address address = (Address) context.getBean("address");
		System.out.println(address);
		
		address = (Address) context.getBean("address2");
		System.out.println(address);
		
		Person person = (Person) context.getBean("person");
		System.out.println(person);
	}

}
