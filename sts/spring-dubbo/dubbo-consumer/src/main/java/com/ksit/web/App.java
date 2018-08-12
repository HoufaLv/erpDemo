package com.ksit.web;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ksit.service.UserService;

public class App {
	
	public static void main(String[] args) throws IOException {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring-dubbo-consumer.xml");
		
		UserService userService = (UserService) context.getBean("userService");
		
		String name = userService.findById(0);
		
		System.out.println(name);
		
		System.in.read();
	}
}
