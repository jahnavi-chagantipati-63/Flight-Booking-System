package com.example.flightbooking.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.NullValueCheckStrategy;

import com.example.flightbooking.dto.FlightInstanceDto;
import com.example.flightbooking.model.FlightInstance;
/*
 * Flight Instance Mapper
 */
@Mapper(componentModel = "spring", nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS)
public interface FlightInstanceMapper {
    FlightInstanceDto toDto(FlightInstance entity);
    FlightInstance toEntity(FlightInstanceDto dto);
}
