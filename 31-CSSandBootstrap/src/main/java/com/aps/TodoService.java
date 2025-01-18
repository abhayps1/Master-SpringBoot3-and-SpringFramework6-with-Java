package com.aps;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TodoService {

	private static List<Todo> todos = new ArrayList<>();

	static {
		todos.add(new Todo(1, "aps", "Learn Spring", LocalDate.now().plusYears(1), false));
		todos.add(new Todo(2, "apsb", "Learn Devops", LocalDate.now().plusYears(1), false));
		todos.add(new Todo(3, "adpsb", "Learn Fullstack", LocalDate.now().plusYears(1), false));
	}

	public List<Todo> findByUsername(String username) {
		return todos;
	}
}
