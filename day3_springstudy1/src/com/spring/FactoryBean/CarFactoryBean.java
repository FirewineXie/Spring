package com.spring.FactoryBean;

import org.springframework.beans.factory.FactoryBean;

public class CarFactoryBean implements FactoryBean{
	
	private String brand;
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	//返回bean 的对象
	@Override
	public Car getObject() throws Exception {
		// TODO Auto-generated method stub
		return new Car("BMW", 500000);
	}
	/**
	 * 返回bean的类型
	 * 
	 */
	@Override
	public Class<?> getObjectType() {
		// TODO Auto-generated method stub
		return Car.class;
	}

	@Override
	public boolean isSingleton() {
		// TODO Auto-generated method stub
		return false;
	}
	
	
}
