package com.example.flightbooking.dto;

import lombok.Data;
/*
 * Passenger DTO
 */
@Data
public class PassengerDto {
	private Long id;
	private Long userId;
	private Long bookingId;
	private String seatNumber;
}
