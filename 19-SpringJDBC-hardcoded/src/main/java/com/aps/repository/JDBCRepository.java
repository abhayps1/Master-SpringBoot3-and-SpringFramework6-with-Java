package com.aps.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class JDBCRepository {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	private static final String INSERT_QUERY = """
				insert  into course(id,  name, author)
				values(1,  'Learn AWS','in28min');
			""";

	public void insert() {
		jdbcTemplate.update(INSERT_QUERY);
	}

}
