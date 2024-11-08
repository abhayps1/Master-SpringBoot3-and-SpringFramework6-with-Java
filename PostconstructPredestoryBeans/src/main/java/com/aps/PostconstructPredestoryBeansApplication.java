package com.aps;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
class SomeClass {
	private SomeDependency someDependency;

	public SomeClass(SomeDependency someDependency) {
		super();
		this.someDependency = someDependency;
		System.out.println("All dependency are ready!");
	}

	@PostConstruct
	public void initalize() {
		someDependency.getReady();
	}

	@PreDestroy
	public void cleanup() {
		System.out.println("Cleanup");
	}

}

@Component
class SomeDependency {

	public void getReady() {
		System.out.println("Some logic using SomeDependency");

	}

}

@Configuration
@ComponentScan
public class PostconstructPredestoryBeansApplication {

	public static void main(String[] args) {
		var context = new AnnotationConfigApplicationContext(PostconstructPredestoryBeansApplication.class);
		Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
	}

}
