package com.aps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import jakarta.transaction.Transactional;

@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner {

	@Autowired
	private CourseJPARepositoryEM courseJPARepositoryEM;

	@Override
	@Transactional
	public void run(String... args) throws Exception {
		courseJPARepositoryEM.insert(new Course(1, "jdbc", "ram singh"));

	}

}
