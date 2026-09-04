package com.example.flightbooking.service;

import java.util.List;

import com.example.flightbooking.dto.FlightInstanceDto;
import com.example.flightbooking.exceptions.ResourceNotFoundException;
/*
 * Flight Instance Service Interface
 */
public interface FlightInstanceService {
    List<FlightInstanceDto> findAll();
    FlightInstanceDto save(FlightInstanceDto dto);
    FlightInstanceDto findById(Long id) throws ResourceNotFoundException;
}