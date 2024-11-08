package com.aps;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
class ClassA {

	public ClassA() {
		super();
		System.out.println("Lazy initialization happening");
	}

}

@Component
@Lazy
class ClassB {
	private ClassA classA;

	public ClassB(ClassA classA) {
		System.out.println("Some initialization logic");
		this.classA = classA;
	}
}

@Configuration
@ComponentScan
public class LazyInitializationApplication {

	public static void main(String[] args) {
		var context = new AnnotationConfigApplicationContext(LazyInitializationApplication.class);
		System.out.println("Initialization of context is completed. ");
		context.getBean(ClassB.class);
	}

}
