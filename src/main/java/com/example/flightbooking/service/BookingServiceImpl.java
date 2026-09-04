package com.example.flightbooking.service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.flightbooking.dto.BookingDto;
import com.example.flightbooking.exceptions.ResourceNotFoundException;
import com.example.flightbooking.mapper.BookingMapper;
import com.example.flightbooking.model.Booking;
import com.example.flightbooking.model.BookingStatus;
import com.example.flightbooking.model.Passenger;
import com.example.flightbooking.model.User;
import com.example.flightbooking.repository.BookingRepository;
import com.example.flightbooking.repository.PassengerRepository;
import com.example.flightbooking.repository.UserRepository;
/*
 * Booking Service Implementation
 */
@Service
public class BookingServiceImpl implements BookingService {
	@Autowired
	private BookingRepository repo;
	@Autowired
	private BookingMapper mapper;
	@Autowired
	private UserRepository userRepo;
	@Autowired
	private PassengerRepository passengerRepo;

	public List<BookingDto> findAll() {
		return repo.findAll().stream().map(mapper::toDto).collect(Collectors.toList());
	}

	@Transactional
	public BookingDto save(BookingDto dto) throws ResourceNotFoundException {
		User user = userRepo.findById(dto.getUserId())
				.orElseThrow(() -> new ResourceNotFoundException("User not found"));

		List<Passenger> passengers = passengerRepo.findAll(dto.getPassengerIds());
		if (passengers.size() != dto.getPassengerIds().size()) {
			throw new ResourceNotFoundException("One or more passengers not found");
		}

		Booking booking = new Booking();
		booking.setUser(user);
		booking.setBookingTime(LocalDateTime.now());
		booking.setPnrs(generatePnrs());
		booking.setStatus(BookingStatus.CONFIRMED);
		booking.setPassengers(passengers);

		booking = repo.save(booking);
		return mapper.toDto(booking);
	}

	public BookingDto findById(Long id) throws ResourceNotFoundException {
		Booking entity = repo.findById(id).orElseThrow(() -> new ResourceNotFoundException("Booking not found"));
		return mapper.toDto(entity);
	}

	private String generatePnrs() {
		return UUID.randomUUID().toString().replaceAll("-", "").substring(0, 6).toUpperCase();
    }
}