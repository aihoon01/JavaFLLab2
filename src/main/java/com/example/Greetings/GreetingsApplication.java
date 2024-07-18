package com.example.Greetings;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GreetingsApplication implements CommandLineRunner {

	private final GreetingService greetingService;

	public GreetingsApplication(GreetingService greetingsService) {
		this.greetingService = greetingsService;
	}

	public static void main(String[] args) {
		SpringApplication.run(GreetingsApplication.class, args);
	}

	@Override
	public void run(String ...args) throws Exception {
		System.out.println(greetingService.getGreeting(""));
	}
}
