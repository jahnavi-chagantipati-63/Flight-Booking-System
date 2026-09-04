package com.example.flightbooking.service;

import java.util.List;

import com.example.flightbooking.dto.UserDto;
import com.example.flightbooking.exceptions.ResourceNotFoundException;
/*
 * User Service Interface
 */
public interface UserService {
    List<UserDto> findAll();
    UserDto save(UserDto dto);
    UserDto findById(Long id) throws ResourceNotFoundException;
}
