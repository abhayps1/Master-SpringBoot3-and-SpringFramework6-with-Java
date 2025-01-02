package com.aps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseJDBCCLI implements CommandLineRunner {

	@Autowired
	private CourseJDBCRepo courseJDBCRepo;

	@Override
	public void run(String... args) throws Exception {
		courseJDBCRepo.insert(new Course(1, "Learn Python", "aps"));
		courseJDBCRepo.insert(new Course(2, "Learn Java", "aps"));
		courseJDBCRepo.insert(new Course(3, "Learn cpp", "aps"));

		courseJDBCRepo.delete(1);
	}

}
