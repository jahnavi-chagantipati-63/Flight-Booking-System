package com.example.flightbooking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.flightbooking.dto.AirportDto;
import com.example.flightbooking.exceptions.ResourceNotFoundException;
import com.example.flightbooking.service.AirportService;

import jakarta.validation.Valid;
/*
 * Airport Controller
 */
@RestController
@RequestMapping("/airport")
public class AirportController {
	@Autowired
    private AirportService airportService;

    @PostMapping
    public ResponseEntity<AirportDto> create(@Valid @RequestBody AirportDto dto) {
        return ResponseEntity.ok(airportService.create(dto));
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<AirportDto> get(@PathVariable Long id) throws ResourceNotFoundException {
        return ResponseEntity.ok(airportService.get(id));
    }
}
