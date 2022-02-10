package baha.edu.kg.SecondApp_CS204;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController

public class SecondAppCs204Application {

	public static void main(String[] args) {
		SpringApplication.run(SecondAppCs204Application.class, args);
	}

	@GetMapping("/")
	public String index() {
		return "How Are You!!! <a href='/about'>";
	}
	@GetMapping("/about")
	public String about() {
		return "<h1>Ikramov BAkyt<h1>";
	}



}
