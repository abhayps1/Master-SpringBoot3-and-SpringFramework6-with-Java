package com.aps;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
class BusinessLogic3 {
	Dependency12 dependency1;
	Dependency22 dependency2;

	@Autowired
	public BusinessLogic3(Dependency12 dependency1, Dependency22 dependency2) {
		super();
		System.out.println("Dependency injection happening using constructor");
		this.dependency1 = dependency1;
		this.dependency2 = dependency2;
	}

	@Override
	public String toString() {
		return "Using " + dependency1 + "\nand \n" + dependency2;
	}

}

@Component
class Dependency12 {

}

@Component
class Dependency22 {

}

@Configuration
@ComponentScan
public class ConstructorInjection {

	public static void main(String[] args) {
		try (var context = new AnnotationConfigApplicationContext(ConstructorInjection.class);) {
			System.out.println(context.getBeanDefinitionNames().length);
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

			System.out.println(context.getBean(BusinessLogic3.class));
			context.close();
		}
	}

}
