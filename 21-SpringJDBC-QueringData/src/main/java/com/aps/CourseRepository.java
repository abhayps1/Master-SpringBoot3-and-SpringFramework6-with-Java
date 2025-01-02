package com.aps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CourseRepository {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	private static final String INSERT_QUERY = """
			INSERT INTO course (id, name, author)
			values(?, ?, ?);
			""";

	private static final String DELETE_QUERY = """
			DELETE FROM course WHERE  id = ?;
			""";

	private static final String SELECT_QUERY = """
			SELECT *  FROM course WHERE id =  ?;
			""";

	public void insert(Course course) {
		jdbcTemplate.update(INSERT_QUERY, course.getId(), course.getName(), course.getAuthor());
	}

	public void delete(int id) {
		jdbcTemplate.update(DELETE_QUERY, id);
	}

	public Course findById(int id) {

		// ResultSet --> Bean --> Row Mapper -->
		return jdbcTemplate.queryForObject(SELECT_QUERY, new BeanPropertyRowMapper<>(Course.class), id);
	}
}
