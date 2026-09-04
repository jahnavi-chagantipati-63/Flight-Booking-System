package com.example.flightbooking.dto;

import java.time.LocalDate;
import java.time.LocalTime;

import lombok.Data;
/*
 * Flight Instance DTO
 */
@Data
public class FlightInstanceDto {

	private Long id;
    private Long flightId;
    private LocalDate departureDate;
    private LocalTime departureTime;
    private LocalTime arrivalTime;
    private String status;
}
