package com.example.flightbooking.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.flightbooking.dto.FlightInstanceDto;
import com.example.flightbooking.exceptions.ResourceNotFoundException;
import com.example.flightbooking.mapper.FlightInstanceMapper;
import com.example.flightbooking.model.FlightInstance;
import com.example.flightbooking.repository.FlightInstanceRepository;

import jakarta.transaction.Transactional;
/*
 * Flight Instance Service Implementation
 */
@Service
public class FlightInstanceServiceImpl implements FlightInstanceService {
	@Autowired
    private FlightInstanceRepository repo;
	@Autowired
    private FlightInstanceMapper mapper;

    public List<FlightInstanceDto> findAll() {
        return repo.findAll().stream().map(mapper::toDto).collect(Collectors.toList());
    }

    @Transactional
    public FlightInstanceDto save(FlightInstanceDto dto) {
        FlightInstance entity = mapper.toEntity(dto);
        return mapper.toDto(repo.save(entity));
    }

    public FlightInstanceDto findById(Long id) throws ResourceNotFoundException {
        FlightInstance entity = repo.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("FlightInstance not found"));
        return mapper.toDto(entity);
    }
}

