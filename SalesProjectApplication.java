package com.citiustech.it.SalesProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.citiustech.it.SalesProject.repository.CustomerRepository;


@SpringBootApplication
public class SalesProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SalesProjectApplication.class, args);
	}
}
