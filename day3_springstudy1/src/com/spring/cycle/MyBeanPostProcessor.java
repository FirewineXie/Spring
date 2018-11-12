package com.spring.cycle;

import org.springframework.aop.framework.autoproxy.BeanNameAutoProxyCreator;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
/*
 * 这是文件是spring关闭Bean的生命周期
 * 
 */
public class MyBeanPostProcessor implements BeanPostProcessor {

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		// TODO Auto-generated method stub
		
		System.out.println("PostProcessBeforeInitialization ："+ bean + "," + beanName);
		if ("car".equals(beanName)) {
			
		}
		
		return bean;
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("PostProcessAfterInitialization ："+ bean + "," + beanName);
		
		Car car = new Car();
		car.setBrand("Ford");
		
		return car;
	}

}
