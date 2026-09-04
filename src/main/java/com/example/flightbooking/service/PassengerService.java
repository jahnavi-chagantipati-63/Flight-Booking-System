package com.example.flightbooking.service;

import java.util.List;

import com.example.flightbooking.dto.PassengerDto;
import com.example.flightbooking.exceptions.ResourceNotFoundException;
/*
 * Passenger Service Interface
 */
public interface PassengerService {
    List<PassengerDto> findAll();
    PassengerDto save(PassengerDto dto);
    PassengerDto findById(Long id) throws ResourceNotFoundException;
}
