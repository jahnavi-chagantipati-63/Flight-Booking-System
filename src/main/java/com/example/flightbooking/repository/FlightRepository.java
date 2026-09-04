package com.example.flightbooking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.flightbooking.model.Airport;
import com.example.flightbooking.model.Flight;
import java.util.List;

/*
 * Flight Repository
 */
@Repository
public interface FlightRepository extends JpaRepository<Flight, Long>{
List<Flight> findByArrivalAirport(String arrival);
List<Flight> findByDepartureAirport(String destination);
}
