package com.spring.ref;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static void main(String[] args) {
		

		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext-annotation.xml");
		
		UserAction userAction = (UserAction) ctx.getBean("userAction");
		userAction.execute();
	}
	
}
