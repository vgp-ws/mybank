package ru.exchange.mybank;

import org.springframework.boot.SpringApplication;

import ru.exchange.mybank.Application;

public class TestApplication {

	public static void main(String[] args) {
		SpringApplication.from(Application::main).with(TestApplication.class).run(args);
	}

}
