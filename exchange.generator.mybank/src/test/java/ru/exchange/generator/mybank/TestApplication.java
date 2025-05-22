package ru.exchange.generator.mybank;

import org.springframework.boot.SpringApplication;

import ru.exchange.generator.mybank.Application;

public class TestApplication {

	public static void main(String[] args) {
		SpringApplication.from(Application::main).with(TestApplication.class).run(args);
	}

}
