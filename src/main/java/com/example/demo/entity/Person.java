package com.example.demo.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Person {
	
	@Id
	private String id;
	
	private String name;
	
	private String title;

	public Person(String name, String title) {
		super();
		this.name = name;
		this.title = title;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", title=" + title + "]";
	}

	public Person() {
		super();
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getTitle() {
		return title;
	}
	


}
