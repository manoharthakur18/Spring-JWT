package com.app.boot.controller;

import java.util.Date;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/main")
public class MainController {

	@GetMapping("/home")
	public ResponseEntity<String> home() {
		return ResponseEntity.ok("This is home page");
	}
}
