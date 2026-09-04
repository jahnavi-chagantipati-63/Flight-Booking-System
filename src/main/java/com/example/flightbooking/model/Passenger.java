package com.example.flightbooking.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
/*
 * Passenger Entity
 */
@Data
@Table
@Entity
public class Passenger {
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank 
    private String firstName;
    
    @NotBlank 
    private String lastName;

    @Email 
    @NotBlank 
    private String email;
    
    @NotBlank 
    private String phone;

    @ManyToOne 
    @JoinColumn(name = "booking_id", nullable = false)
    private Booking booking;
}


