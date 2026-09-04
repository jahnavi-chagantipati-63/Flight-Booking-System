package com.example.flightbooking.exceptions;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
/*
 * Resource Not Found Exception
 */
@SuppressWarnings("serial")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResourceNotFoundException extends Exception {
    private String message;
}
