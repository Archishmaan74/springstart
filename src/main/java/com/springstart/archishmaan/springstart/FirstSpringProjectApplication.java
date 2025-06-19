package com.springstart.archishmaan.springstart;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FirstSpringProjectApplication implements CommandLineRunner {

	ProdDB prodDB;

	public static void main(String[] args) {
		SpringApplication.run(FirstSpringProjectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		prodDB = new ProdDB();
		System.out.println(prodDB.getData());
	}
}
