package com.example.flightbooking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.flightbooking.dto.PassengerDto;
import com.example.flightbooking.service.PassengerService;
/*
 * Passenger Controller
 */
@RestController
@RequestMapping("/passengers")
public class PassengerController {
	
	@Autowired
	private PassengerService service;

	@GetMapping
	public ResponseEntity<List<PassengerDto>> getAll() {
		return ResponseEntity.ok(service.findAll());
	}

	@GetMapping("/{id}")
	public ResponseEntity<PassengerDto> get(@PathVariable Long id) {
		return ResponseEntity.ok(service.findById(id));
	}

	@PostMapping
	public ResponseEntity<PassengerDto> create(@RequestBody PassengerDto dto) {
		return new ResponseEntity<>(service.save(dto), HttpStatus.CREATED);
	}
}
