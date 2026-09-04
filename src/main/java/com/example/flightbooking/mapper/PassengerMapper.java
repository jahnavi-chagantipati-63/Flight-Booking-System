package com.example.flightbooking.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.NullValueCheckStrategy;

import com.example.flightbooking.dto.PassengerDto;
import com.example.flightbooking.model.Passenger;
/*
 * Passenger Mapper
 */
@Mapper(componentModel = "spring", nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS)
public interface PassengerMapper {
    PassengerDto toDto(Passenger entity);
    Passenger toEntity(PassengerDto dto);
}
