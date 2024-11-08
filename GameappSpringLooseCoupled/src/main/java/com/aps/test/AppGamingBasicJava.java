package com.aps.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppGamingBasicJava {

	public static void main(String[] args) {
		try (var context = new AnnotationConfigApplicationContext(GameConfiguration.class)) {
			context.getBean(GameRunner.class).run();
		}
//		catch (BeansException e) {
//
//			e.printStackTrace();
//		}
	}
}
