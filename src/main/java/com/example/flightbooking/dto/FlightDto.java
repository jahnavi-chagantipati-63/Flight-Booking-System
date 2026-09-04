package com.example.flightbooking.dto;


import jakarta.validation.constraints.NotBlank;
import lombok.Data;
/*
 * Flight DTO
 */
@Data
public class FlightDto {
	private Long id;
	
	@NotBlank
	private String flightNumber;
	private Long departureAirportId;
	private Long arrivalAirportId;
}

