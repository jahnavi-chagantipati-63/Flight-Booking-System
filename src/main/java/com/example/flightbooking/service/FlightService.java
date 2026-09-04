package com.example.flightbooking.service;

import java.util.List;

import com.example.flightbooking.dto.FlightDto;
import com.example.flightbooking.exceptions.ResourceNotFoundException;
/*
 * Flight Service Interface
 */
public interface FlightService {
    List<FlightDto> findAll();
    FlightDto save(FlightDto dto);
    FlightDto findById(Long id) throws ResourceNotFoundException;
	List<FlightDto> searchFlights(String arrival);
}