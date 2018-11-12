package com.spring.aop.xml;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class LoggingAspect {
	
	
	
	public void declareJoinPointException() {}
	
	
	public void beforeMethd(JoinPoint joinPoint) {
		String methodName = joinPoint.getSignature().getName();
		Object [] args = joinPoint.getArgs();
		
		
		System.out.println("The method "+ methodName+"begins with " + Arrays.asList(args));
	}
	
	public void afterMethod(JoinPoint joinPoint) {
		String methodName = joinPoint.getSignature().getName();
		
		
		System.out.println("The method "+ methodName+"ends " );
	}
	
	public void afterReturning(JoinPoint joinPoint , Object result) {
		String methodName = joinPoint.getSignature().getName();
		Object [] args = joinPoint.getArgs();
		
		System.out.println("The method "+ methodName+"ends with" + result );
	}

	public void afterThrowing(JoinPoint joinPoint,Exception ex) {
		String methodName = joinPoint.getSignature().getName();
		
		System.out.println("The method "+ methodName+"occurs excetion :" + ex );
	}
	
	
	public Object aroundMethod(ProceedingJoinPoint pjd) {
		System.out.println("aroundMethod");
		Object result = null;
		String methodName = pjd.getSignature().getName();
		//执行目标方法
		try{
			//前置通知
			System.out.println("The method "+ methodName + "begins with " + Arrays.asList(pjd.getArgs()));
			result = pjd.proceed();
			//后置通知
			System.out.println("The method "+methodName+"ends with " + result);
		}catch (Throwable e) {
			//异常通知
			System.out.println("the method occurs exception : "+ e);
			e.printStackTrace();
		}
		//后置通知
		System.out.println("The method " + methodName + "ends");
		return result;
	}
}
