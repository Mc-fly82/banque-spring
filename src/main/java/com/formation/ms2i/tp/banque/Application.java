package com.formation.ms2i.tp.banque;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	@Autowired


	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
