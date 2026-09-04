package com.example.flightbooking.service;

import java.util.List;

import com.example.flightbooking.dto.BookingDto;
import com.example.flightbooking.exceptions.ResourceNotFoundException;
/*
 * Booking Service
 */
public interface BookingService {
    List<BookingDto> findAll();
    BookingDto save(BookingDto dto) throws ResourceNotFoundException;
    BookingDto findById(Long id) throws ResourceNotFoundException;
}