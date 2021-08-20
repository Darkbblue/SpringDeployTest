package com.kg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/service")
public class MainController {

	@Autowired
	RestTemplate restTemplate;

	@GetMapping("/hello")
	public ResponseEntity<?> hello() {
		return ResponseEntity.ok("Hello, world!");
	}
}
