package com.spring.annotation.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.annotation.TestObject;
//持久化层

@Repository("userRepository")
public class UserRepositoryImpl implements UserRepository {
	
	@Autowired(required = false)//如果没有装配显示的是null
	private TestObject testObject;
	
	
	private UserRepository UserRepository;
	
	@Autowired
	public void setUserRepository(UserRepository userRepository) {
		UserRepository = userRepository;
	}
	
	@Override
	public void save() {
		// TODO Auto-generated method stub
		System.out.println("UserRepository Save ....");
		System.out.println(testObject);
	}

}
