package com.example.flightbooking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.flightbooking.model.FlightInstance;
/*
 * Flight Instance Repository
 */
@Repository
public interface FlightInstanceRepository extends JpaRepository<FlightInstance, Long> {
}
