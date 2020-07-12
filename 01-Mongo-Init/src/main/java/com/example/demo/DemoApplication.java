package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.entity.Person;
import com.example.demo.repo.PersonRepository;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner{

	@Autowired
	PersonRepository personRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		personRepository.deleteAll();
		
		List<Person> persons = new ArrayList<>();
		persons.add(new Person("baba", "babatitle"));
		persons.add(new Person("lolo", "lolobaba"));
		
		personRepository.saveAll(persons);
		
		for(Person person : personRepository.findAll())
			System.out.println(person);
		
	}

}
