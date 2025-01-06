package com.aps;

import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
public class CourseJPARepositoryEM {

	@PersistenceContext
	private EntityManager entityManager;

	@Transactional
	public void insert(Course course) {
		entityManager.merge(course);
	}

	public Course findById(long id) {
		return entityManager.find(Course.class, id);
	}

	public void deleteById(long id) {
		Course course = entityManager.find(Course.class, id);
		entityManager.remove(course);

	}

}
