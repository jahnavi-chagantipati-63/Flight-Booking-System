package com.example.flightbooking.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.flightbooking.dto.UserDto;
import com.example.flightbooking.exceptions.ResourceNotFoundException;
import com.example.flightbooking.mapper.UserMapper;
import com.example.flightbooking.model.User;
import com.example.flightbooking.repository.UserRepository;
import org.springframework.security.crypto.password.PasswordEncoder;

import jakarta.transaction.Transactional;
/*
 * User Service Implementation
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
	private UserRepository repo;
    @Autowired
    private UserMapper mapper;
    @Autowired
    private PasswordEncoder passwordEncoder;

    public List<UserDto> findAll() {
        return repo.findAll().stream().map(mapper::toDto).collect(Collectors.toList());
    }

    @Transactional
    public UserDto save(UserDto dto) {
        User entity = mapper.toEntity(dto);
        entity.setPasswordHash(passwordEncoder
                          .encode(dto.getPassword()));
        return mapper.toDto(repo.save(entity));
    }

    public UserDto findById(Long id) throws ResourceNotFoundException {
        User entity = repo.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("User not found"));
        return mapper.toDto(entity);
    }
}


