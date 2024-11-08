package com.aps;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
class BusinessLogic2 {
	Dependency11 dependency1;
	Dependency21 dependency2;

	@Autowired
	public void setDependency1(Dependency11 dependency1) {
		System.out.println("Setter INjection :- Dependency 1");
		this.dependency1 = dependency1;
	}

	@Autowired
	public void setDependency2(Dependency21 dependency2) {
		System.out.println("Setter INjection :- Dependency 2");
		this.dependency2 = dependency2;
	}

	@Override
	public String toString() {
		return "Using " + dependency1 + "\nand \n" + dependency2;
	}
}

@Component
class Dependency11 {

}

@Component
class Dependency21 {

}

@Configuration
@ComponentScan
public class SetterInjectionApplication {

	public static void main(String[] args) {
		try (var context = new AnnotationConfigApplicationContext(SetterInjectionApplication.class);) {
			System.out.println(context.getBeanDefinitionNames().length);
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

			System.out.println(context.getBean(BusinessLogic2.class));
			context.close();
		}
	}

}
