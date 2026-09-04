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

import com.example.flightbooking.dto.UserDto;
import com.example.flightbooking.exceptions.ResourceNotFoundException;
import com.example.flightbooking.service.UserService;
/*
 * User Controller
 */
@RestController
@RequestMapping("/users")
public class UserController {
	@Autowired
	private UserService service;

	@GetMapping
	public ResponseEntity<List<UserDto>> getAll() {
		return ResponseEntity.ok(service.findAll());
	}

	@GetMapping("/{id}")
	public ResponseEntity<UserDto> get(@PathVariable Long id) throws ResourceNotFoundException {
		return ResponseEntity.ok(service.findById(id));
	}

	@PostMapping
	public ResponseEntity<UserDto> create(@RequestBody UserDto dto) {
		return new ResponseEntity<>(service.save(dto), HttpStatus.CREATED);
	}
}
