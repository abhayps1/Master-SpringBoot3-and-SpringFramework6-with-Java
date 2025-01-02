package com.aps.runner;

import org.springframework.beans.factory.annotation.Autowired;

/*
 * In Spring Boot, a CommandLineRunner is a functional interface
 *  used to execute code after the application context is loaded
 *   and before the Spring Boot application starts running. 
 *   It provides a convenient way to run specific logic 
 *   during the startup of a Spring Boot application.
 * */

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.aps.repository.JDBCRepository;

@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner {

	@Autowired
	private JDBCRepository jdbcRepository;

	@Override
	public void run(String... args) throws Exception {
		jdbcRepository.insert();
	}

}
