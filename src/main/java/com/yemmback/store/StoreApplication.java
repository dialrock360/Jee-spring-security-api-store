package com.yemmback.store;

import org.springframework.beans.factory.annotation.Autowired;
		import org.springframework.boot.CommandLineRunner;
		import org.springframework.boot.SpringApplication;
		import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class StoreApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StoreApplication.class, args);

	}
	@Autowired
	private PasswordEncoder encoder;
	@Override
	public void run(String... args) throws Exception {
		System.out.println(encoder.encode("passer"));
	}
}
