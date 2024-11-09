package com.aps;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {

	@RequestMapping("/courses")
	public List<Course> getCourses() {
		return Arrays.asList(new Course(1, "book1", "author1"), new Course(2, "book2", "author2"),
				new Course(0, "zerobook", "zeropublisher"));
	}
}
