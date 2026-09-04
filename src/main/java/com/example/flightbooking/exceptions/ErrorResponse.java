package com.example.flightbooking.exceptions;

import lombok.AllArgsConstructor;
import lombok.Data;
/*
 * Error response to display on response side that is postman
 */
@Data
@AllArgsConstructor
public class ErrorResponse {
    private int status;
    private String message;
}
