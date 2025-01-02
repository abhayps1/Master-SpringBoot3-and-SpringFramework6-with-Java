package com.aps;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import jakarta.inject.Inject;
import jakarta.inject.Named;

//@Component
@Named
class BusinessLayer {
	private DataLayer datalayer;

	public DataLayer getDatalayer() {
		return datalayer;
	}

//	@Autowired
	@Inject
	public void setDatalayer(DataLayer datalayer) {
		this.datalayer = datalayer;
		System.out.println("Setter injection");
	}

}

//@Component
@Named
class DataLayer {

}

@Configuration
@ComponentScan
public class JakartaContextsAndDependencyInjectionCdiApplication {

	public static void main(String[] args) {
		var context = new AnnotationConfigApplicationContext(JakartaContextsAndDependencyInjectionCdiApplication.class);
		Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
	}

}
