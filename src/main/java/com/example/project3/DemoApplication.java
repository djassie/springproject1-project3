package com.example.project3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
@RestController
public class DemoApplication {

	private final List<String> responseString = new ArrayList<>(Arrays.asList("Hello", "Response"));

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@RequestMapping(value="/", method= RequestMethod.GET)
	ResponseEntity<?> helloResponse(){
		return new ResponseEntity<>(responseString, HttpStatus.ACCEPTED);
	}

}
