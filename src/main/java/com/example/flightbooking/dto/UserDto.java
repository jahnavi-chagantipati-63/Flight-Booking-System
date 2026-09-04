package com.example.flightbooking.dto;

import lombok.Data;

/*
 * User DTO
 */
@Data
public class UserDto {
	private Long id;
    private String email;
    private String password;          
    private String firstName;
    private String lastName;
}
