package com.example.flightbooking.dto;

import java.time.LocalDateTime;
import java.util.List;

import com.example.flightbooking.model.Passenger;

import lombok.Data;
/*
 * Booking DTO
 */
@Data
public class BookingDto {
	private Long id;
    private Long userId;
    private List<Passenger> passengerIds;
    private String pnrs;             
    private LocalDateTime bookingTime; 
    private String status;
}
