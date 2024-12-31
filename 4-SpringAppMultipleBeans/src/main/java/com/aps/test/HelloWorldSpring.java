package com.aps.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class HelloWorldSpring {

	public static void main(String[] args) {

		// 1. Launch a spring context

		var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);

		// 2. Configure the things that we want spring to manage - @Configuration
		// HelloWorldConfiguration - @Configuration
		// name - @Bean

		// 3. Retriving beans managed by Spring
		System.out.println(context.getBean("name"));
		System.out.println(context.getBean("age"));
		System.out.println(context.getBean("person"));
		System.out.println(context.getBean("address3"));
//		System.out.println(context.getBean(Address.class)); // Two beans of same type i.e. Address type is causing this conflict
	}
}
