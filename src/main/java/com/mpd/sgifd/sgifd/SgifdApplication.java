package com.mpd.sgifd.sgifd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SgifdApplication {

	@GetMapping("/")
	public String sayHi(){
		return "Test de l'application simple de Spring boot";
	}

	public static void main(String[] args) {
		SpringApplication.run(SgifdApplication.class, args);
	}

}
