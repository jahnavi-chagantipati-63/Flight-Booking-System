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

import com.example.flightbooking.dto.BookingDto;
import com.example.flightbooking.exceptions.ResourceNotFoundException;
import com.example.flightbooking.service.BookingService;

/*
 * Booking Controller
 */
@RestController
@RequestMapping("/bookings")
public class BookingController {
	
	@Autowired
	private BookingService service;

	@GetMapping
	public ResponseEntity<List<BookingDto>> getAll() {
		return ResponseEntity.ok(service.findAll());
	}

	@GetMapping("/{id}")
	public ResponseEntity<BookingDto> get(@PathVariable Long id) throws ResourceNotFoundException {
		return ResponseEntity.ok(service.findById(id));
	}

	@PostMapping
	public ResponseEntity<BookingDto> create(@RequestBody BookingDto dto) throws ResourceNotFoundException {
		return new ResponseEntity<>(service.save(dto), HttpStatus.CREATED);
	}
}
