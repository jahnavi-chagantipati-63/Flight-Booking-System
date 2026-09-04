package com.example.flightbooking.dto;

import jakarta.validation.constraints.*;
import lombok.Data;
/*
 * Airport DTO
 */
@Data
public class AirportDto {
	
	private Long id;
	
    @NotBlank
    private String code;
    
    @NotBlank
    private String name;
    
    @NotBlank
    private String city;
    
    @NotBlank
    private String country;
}
