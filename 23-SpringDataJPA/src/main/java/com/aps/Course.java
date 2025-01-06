package com.aps;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Course {

	@Id
	private long id;
	private String name;
	private String writer;

	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Course(long id, String name, String writer) {
		super();
		this.id = id;
		this.name = name;
		this.writer = writer;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", writer=" + writer + "]";
	}

}
