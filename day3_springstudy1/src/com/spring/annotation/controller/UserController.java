package com.spring.annotation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.spring.annotation.service.UserService;
//表现层

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	

	public void execute() {
		System.out.println("UserController execute ...");
		userService.add();
	}
}
