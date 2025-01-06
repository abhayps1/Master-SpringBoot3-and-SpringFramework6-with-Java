package com.aps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import jakarta.transaction.Transactional;

@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner {

	@Autowired
	private CourseJPARepositoryEM repository;

	@Override
	@Transactional
	public void run(String... args) throws Exception {
		repository.insert(new Course(1, "jdbc", "ram singh"));
		repository.insert(new Course(2, "entitymanager", "shyam singh"));
		repository.insert(new Course(3, "transaction", "karm singh"));

		repository.deleteById(3);

		System.out.println(repository.findById(1));
		System.out.println(repository.findById(2));

	}

}
