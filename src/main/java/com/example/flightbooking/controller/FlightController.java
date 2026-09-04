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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.flightbooking.dto.FlightDto;
import com.example.flightbooking.exceptions.ResourceNotFoundException;
import com.example.flightbooking.service.FlightService;

/*
 * Flight Controller
 */
@RestController
@RequestMapping("/flights")
public class FlightController {
	@Autowired
	private FlightService service;

	@GetMapping
	public ResponseEntity<List<FlightDto>> getAll() {
		return ResponseEntity.ok(service.findAll());
	}

	@GetMapping("/{id}")
	public ResponseEntity<FlightDto> get(@PathVariable Long id) throws ResourceNotFoundException {
		return ResponseEntity.ok(service.findById(id));
	}

	@GetMapping("/search")
	public ResponseEntity<List<FlightDto>> searchFlights(@RequestParam String arrival) {
		List<FlightDto> flights = service.searchFlights(arrival);
		return ResponseEntity.ok(flights);
	}

	@PostMapping
	public ResponseEntity<FlightDto> create(@RequestBody FlightDto dto) {
		return new ResponseEntity<>(service.save(dto), HttpStatus.CREATED);
	}
}
