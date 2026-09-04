package com.example.flightbooking.service;

import com.example.flightbooking.dto.AirportDto;
import com.example.flightbooking.exceptions.ResourceNotFoundException;
/*
 * Airport Service Interface
 */
public interface AirportService {
	AirportDto create(AirportDto airportDto);
	AirportDto get(Long id) throws ResourceNotFoundException;

}