package com.aps;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.aps.configs.GameConfiguration;
import com.aps.configs.GameRunner;

public class AppGamingBasicJava {

	public static void main(String[] args) {
		try (var context = new AnnotationConfigApplicationContext(GameConfiguration.class)) {
			context.getBean(GameRunner.class).run();
		}

	}
}
