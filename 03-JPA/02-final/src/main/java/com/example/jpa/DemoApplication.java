package com.example.jpa;

import java.util.ArrayList;
import java.util.List;

import com.example.jpa.model.Account;
import com.example.jpa.repository.AccountRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner{

	@Autowired
	AccountRepository accountRepository;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		List<Account> accounts = new ArrayList<>();
		accounts.add(new Account(123L,12345L));	
		accounts.add(new Account(234L,23456L));	
		accounts.add(new Account(345L,34567L));	
		accountRepository.saveAll(accounts);
		

	}

}
