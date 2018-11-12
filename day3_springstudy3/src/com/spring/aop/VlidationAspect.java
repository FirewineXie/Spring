package com.spring.aop;



import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
/*
 * 
 * @order 是优先级的意思 数值越小，优先级越高
 */
@Order(1)
@Aspect
@Component
public class VlidationAspect {
	
	@After("execution(public int com.spring.aop.ArithmeticCalculator.*(..))")
	public void validateArgs(JoinPoint joinPoint) {
		System.out.println("-->validate:" +Arrays.asList(joinPoint.getArgs()));
	}
}
