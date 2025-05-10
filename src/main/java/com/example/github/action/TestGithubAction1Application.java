package com.example.github.action;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestGithubAction1Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(TestGithubAction1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Application started");
		
	}

}
