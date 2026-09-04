package com.example.flightbooking.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.flightbooking.dto.AirportDto;
import com.example.flightbooking.exceptions.ResourceNotFoundException;
import com.example.flightbooking.mapper.AirportMapper;
import com.example.flightbooking.model.Airport;
import com.example.flightbooking.repository.AirportRepository;

import jakarta.transaction.Transactional;
/*
 * Airport Service Implementation
 */
@Service
public class AirportServiceImpl implements AirportService {
	@Autowired
	private AirportRepository airportRepository;
	
	@Autowired
	private AirportMapper airportMapper;
	
	@Transactional
	public AirportDto create(AirportDto airportDto) {
		Airport airport = airportMapper.toEntity(airportDto);
		Airport saved = airportRepository.save(airport);
		return airportMapper.toDto(saved);
	}
	public AirportDto get(Long id) throws ResourceNotFoundException {
		if (id == null) {
			return null;
		}
		return airportRepository.findById(id).map(airportMapper::toDto).orElseThrow(() -> new ResourceNotFoundException("Airport not found"));
	}
}