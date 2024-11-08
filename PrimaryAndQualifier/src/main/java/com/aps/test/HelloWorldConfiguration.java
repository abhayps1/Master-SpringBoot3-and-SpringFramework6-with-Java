package com.aps.test;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Person(String name, int age, Address address) {

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
	public Person person(String name, int age, @Qualifier("certainname") Address address) {
		var person = new Person(name, age, address);
		return person;
	}

	@Bean
	@Qualifier("certainname")
	public Address address2() {
		return new Address("Boston steet", "London");
	}

	@Bean
	@Primary
	public Address address3() {
		return new Address("Village post", "INdia");
	}

}
