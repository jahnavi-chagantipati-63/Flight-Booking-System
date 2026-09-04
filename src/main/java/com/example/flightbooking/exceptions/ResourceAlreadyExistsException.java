package com.example.flightbooking.exceptions;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/*
 * Resource Already Exists Exception
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResourceAlreadyExistsException extends Exception {
    private String message;
}
