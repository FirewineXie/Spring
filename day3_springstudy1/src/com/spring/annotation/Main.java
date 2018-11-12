package com.spring.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.annotation.controller.UserController;
import com.spring.annotation.repository.UserRepository;
import com.spring.annotation.service.UserService;

public class Main {

	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans_annotation.xml");
//		
//		TestObject tObject = (TestObject) context.getBean("testObject");
//		System.out.println(tObject);
//		
		UserController userController = (UserController) context.getBean("userController");
		System.out.println(userController);
		userController.execute();
//		
//		UserService userService = (UserService) context.getBean("userService");
//		System.out.println(userService);
//		
//		UserRepository userRepository = (UserRepository) context.getBean("userRepository");
//		System.out.println(userRepository);
		
		
		
		
	}
}
