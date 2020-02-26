package com.spring.annotation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.spring.annotation.repository.UserRepository;
//服务层
@Service
public class UserService {
	@Autowired
	//@Qualifier("userRepositoryImpl") //可以在相同的bean情况下，选择，指定bean
	//还可以加到够参里面
	private UserRepository userRepository;
	
	public void add() {
		System.out.println("UserService add ...");

		userRepository.save();
	}
}
