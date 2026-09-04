package com.example.flightbooking.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.flightbooking.dto.FlightDto;
import com.example.flightbooking.exceptions.ResourceNotFoundException;
import com.example.flightbooking.mapper.FlightMapper;
import com.example.flightbooking.model.Flight;
import com.example.flightbooking.repository.FlightRepository;

import jakarta.transaction.Transactional;
/*
 * Flight Service Implementation
 */
@Service
public class FlightServiceImpl implements FlightService {
	@Autowired
    private FlightRepository repo;
	@Autowired
    private FlightMapper mapper;

    public List<FlightDto> findAll() {
        return repo.findAll().stream().map(mapper::toDto).collect(Collectors.toList());
    }

    @Transactional
    public FlightDto save(FlightDto dto) {
        Flight entity = mapper.toEntity(dto);
        return mapper.toDto(repo.save(entity));
    }

    public FlightDto findById(Long id) throws ResourceNotFoundException {
        Flight entity = repo.findById(id).orElseThrow(() -> new ResourceNotFoundException("Flight not found"));
        return mapper.toDto(entity);
    }
    
    public List<FlightDto> searchFlights(String arrival){
    List<Flight> entity = repo.findByArrivalAirport(arrival);
		return mapper.toDto(entity);
    }
}

