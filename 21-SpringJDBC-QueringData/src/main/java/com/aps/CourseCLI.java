package com.aps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseCLI implements CommandLineRunner {

	@Autowired
	private CourseRepository courseRepository;

	@Override
	public void run(String... args) throws Exception {
		courseRepository.insert(new Course(1, "Java", "Aps"));
		courseRepository.insert(new Course(2, "Python", "Aps"));
		courseRepository.insert(new Course(3, "Javascript", "Aps"));

		courseRepository.delete(1);

		System.out.println(courseRepository.findById(2));

	}

}
