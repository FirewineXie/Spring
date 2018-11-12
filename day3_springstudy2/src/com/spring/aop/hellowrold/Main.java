package com.spring.aop.hellowrold;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		ArithmeticCalculator arithmeticCalculator = null;
//		arithmeticCalculator = new ArithmeticCalculatorImpl(); 
//
//		int result = arithmeticCalculator.add(1, 2);
//		System.out.println("-->"+result);
//		result = arithmeticCalculator.div(4, 2);
//		System.out.println("-->"+result);

		ArithmeticCalculator target = new ArithmeticCalculatorImpl();
		ArithmeticCalculator proxy = new ArithmeticCalculatorLoggingProxy(target).getLoggingProxy();
		
		int reuslt = proxy.add(1, 2);
		System.out.println("-->"+reuslt);
		
		
		reuslt =  proxy.div(4, 2);
		System.out.println("-->"+reuslt);

	
	
	}

}
