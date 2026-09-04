package com.example.flightbooking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.flightbooking.model.Booking;
/*
 * Booking Repository
 */
@Repository
public interface BookingRepository extends JpaRepository<Booking, Long>{

}
