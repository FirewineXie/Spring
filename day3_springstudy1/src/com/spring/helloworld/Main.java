package com.spring.helloworld;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static void main(String[] args) {
		
		/*
		//创建HelloWorld 的一个对象
		HelloWorld helloWorld = new HelloWorld();
		//为name赋值
		helloWorld.setName("年后");
		*/
		
		//1.创建spring的ioc 容器对象
		//applicationcontext 这是个接口
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
	
		//2.从IOC获取bean 实例
		//利用id 定位到 IOC容器中Bean
		HelloWorld helloWorld = (HelloWorld) context.getBean("helloworld");
		
		//利用类型返回IOC 容器中的Bean ，但要求IOC 容器中必须只能有一个该类型的Bean
//		HelloWorld helloWorld = context.getBean(HelloWorld.class);
		//调用方法
		helloWorld.hello();
		
		Car car = (Car) context.getBean("car");
		System.out.println(car);
		
		Car car2 = (Car) context.getBean("car2");
		System.out.println(car2);
		
		
		
		Person person = (Person) context.getBean("person");
		System.out.println(person);
	
		Person person2 = (Person) context.getBean("person2");
		System.out.println(person2);
		

	}
}
