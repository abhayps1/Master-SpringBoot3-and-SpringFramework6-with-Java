package com.aps;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
class ClassA {

	public ClassA() {
		super();
		System.out.println("Eager : initialization happening for class A as soon as spring IOC contains generates it ");
	}

}

@Component
@Lazy
class ClassB {
	private ClassA classA;

	public ClassB(ClassA classA) {
		System.out.println("Lazy : Initalization is only happening after its called");
		this.classA = classA;
	}
}

@Configuration
@ComponentScan
public class LazyInitializationApplication {

	public static void main(String[] args) {
		var context = new AnnotationConfigApplicationContext(LazyInitializationApplication.class);
		System.out.println("Initialization of context is completed. ");
		Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
		System.out.println("Streaming is done");
		context.getBean(ClassB.class);
	}

}
