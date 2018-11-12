package com.spring.helloworld;

public class HelloWorld {
	
	private String name;

	public void setName(String name) {
		System.out.println("setname:"+name);
		this.name = name;
	}
	
	public void hello() {
		// TODO Auto-generated method stub
		System.out.println("Hello :"+ name);
	}
	public HelloWorld() {
		// TODO Auto-generated constructor stub
		System.out.println("HelloWorld's Constructor");
	}
}
