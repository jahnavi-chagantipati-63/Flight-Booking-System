package com.example.flightbooking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.flightbooking.model.Airport;
/*
 * Airport Repository
 */
@Repository
public interface AirportRepository extends JpaRepository<Airport, Long>{

}
