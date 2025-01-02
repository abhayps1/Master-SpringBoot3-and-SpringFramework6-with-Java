package com.aps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CourseJDBCRepo {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	private static final String INSERT_QUERY = """
				insert  into course(id,  name, author)
				values(?, ?, ?);
			""";

	private static final String REMOVE_QUERY = """
				delete from course
				where id = ?;
			""";

	public void insert(Course course) {
		jdbcTemplate.update(INSERT_QUERY, course.getId(), course.getName(), course.getAuthor());
	}

	public void delete(int id) {
		jdbcTemplate.update(REMOVE_QUERY, id);
	}

}
