package com.aps.test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person(String name, int age) {

}

record Address(String firstLine, String secondLine) {

}

@Configuration
public class HelloWorldConfiguration {

	@Bean
	public String name() {
		return "Abhay";
	}

	@Bean
	public int age() {
		return 23;
	}

	@Bean
	public Person person(String name, int age) {
		var person = new Person(name, age);
		return person;
	}

	@Bean
	public Address address2() {
		return new Address("Boston steet", "London");
	}

	@Bean
	public Address address3() {
		return new Address("Village post", "INdia");
	}

}
