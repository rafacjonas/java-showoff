package com.showoff;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class Controller {

	@GetMapping(path = "/showoff")
	public String helloWorld() {
		log.info("It's showtime!");
		return "It's showtime!";
	}

	@GetMapping(path = "/showoff-bean")
	public ShowoffBean helloWorldBean() {
		// throw new RuntimeException("Some Error has Happened! Contact Support at
		// ***-***");
		log.info("It's showtime!");
		return new ShowoffBean("It's showtime!");
	}

	/// showoff/path-variable/
	@GetMapping(path = "/controller/path-variable/{name}")
	public ShowoffBean pathVariable(@PathVariable String name) {
		return new ShowoffBean(String.format("Use this as path variable: , %s", name));
	}
}