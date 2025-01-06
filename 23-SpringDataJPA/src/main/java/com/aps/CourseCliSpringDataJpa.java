package com.aps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseCliSpringDataJpa implements CommandLineRunner {

	@Autowired
	private CourseSpringDataJpaRepository repository;

	@Override
	public void run(String... args) throws Exception {
		repository.save(new Course(1, "jdbc", "ram singh"));
		repository.save(new Course(2, "entitymanager", "shyam singh"));
		repository.save(new Course(3, "transaction", "karm singh"));

		repository.deleteById(1l);

		System.out.println(repository.findById(3l));
		System.out.println(repository.findById(2l));

		System.out.println("The number of data in repository  is : " + repository.count());

		System.out.println(repository.findByWriter("shyam singh"));

	}

}
