package com.example.flightbooking.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.NullValueCheckStrategy;

import com.example.flightbooking.dto.AirportDto;
import com.example.flightbooking.model.Airport;
/*
 * Airport Mapper
 */
@Mapper(componentModel = "spring", nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS)
public interface AirportMapper {
	AirportDto toDto(Airport airport);
	Airport toEntity(AirportDto airportDto);
}

