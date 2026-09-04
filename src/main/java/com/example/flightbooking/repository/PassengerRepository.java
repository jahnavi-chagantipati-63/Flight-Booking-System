package com.example.flightbooking.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.flightbooking.model.Passenger;
/*
 * Passenger Repository
 */
@Repository
public interface PassengerRepository extends JpaRepository<Passenger, Long>{

	List<Passenger> findAll(List<Passenger> passengerIds);

}
