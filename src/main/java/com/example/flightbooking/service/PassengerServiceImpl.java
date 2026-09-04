package com.example.flightbooking.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.flightbooking.dto.PassengerDto;
import com.example.flightbooking.exceptions.ResourceNotFoundException;
import com.example.flightbooking.mapper.PassengerMapper;
import com.example.flightbooking.model.Passenger;
import com.example.flightbooking.repository.PassengerRepository;
/*
 * Passenger Service Implementation
 */
@Service
public class PassengerServiceImpl implements PassengerService {
	@Autowired
    private PassengerRepository repo;
	@Autowired
    private PassengerMapper mapper;

    public List<PassengerDto> findAll() {
        return repo.findAll().stream().map(mapper::toDto).collect(Collectors.toList());
    }

    @Transactional
    public PassengerDto save(PassengerDto dto) {
        Passenger entity = mapper.toEntity(dto);
        return mapper.toDto(repo.save(entity));
    }

    public PassengerDto findById(Long id) throws ResourceNotFoundException {
        Passenger entity = repo.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Passenger not found"));
        return mapper.toDto(entity);
    }
}
