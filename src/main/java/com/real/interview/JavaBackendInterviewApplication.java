package com.real.interview;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 *

Welcome to the screening interview! For this exercise, we are going to implement a simple CRUD API using Spring Boot and JPA. Use H2 as in memory db if needed.
Build a microservice that will return metadata for movies that will power a website similar to IMDb.com.
Your API should be able to do the following:
Create, read, update, and delete an individual movie.
		Search for movies by their title and release year.
A movie consists of the following data:
		ID
		Title
		Release Year

Please implement all of the necessary classes and configuration in order to support the specified APIs above.
Feel free to add a test or two.

You will have 45 minutes to complete this task.
At the end of the interview, please zip up your source code and email it to us. Please don’t add more code after the interview is concluded.
 */

@SpringBootApplication
public class JavaBackendInterviewApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaBackendInterviewApplication.class, args);
	}

}
