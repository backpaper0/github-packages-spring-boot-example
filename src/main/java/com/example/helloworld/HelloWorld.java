package com.example.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

	@GetMapping
	public Greeting sayHello(@RequestParam(defaultValue = "world") String name) {
		return new Greeting("Hello, " + name + "!");
	}

	public static class Greeting {

		private final String message;

		public Greeting(String message) {
			this.message = message;
		}

		public String getMessage() {
			return message;
		}
	}
}
