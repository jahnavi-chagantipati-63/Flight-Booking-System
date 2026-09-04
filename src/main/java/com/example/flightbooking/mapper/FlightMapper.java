package com.example.flightbooking.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.NullValueCheckStrategy;

import com.example.flightbooking.dto.FlightDto;
import com.example.flightbooking.model.Flight;
/*
 * Flight Mapper
 */
@Mapper(componentModel = "spring", nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS)
public interface FlightMapper {
    FlightDto toDto(Flight entity);
    Flight toEntity(FlightDto dto);
	List<FlightDto> toDto(List<Flight> entity);
}
