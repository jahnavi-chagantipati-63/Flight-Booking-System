package com.example.flightbooking.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.NullValueCheckStrategy;

import com.example.flightbooking.dto.UserDto;
import com.example.flightbooking.model.User;
/*
 * User Mapper
 */
@Mapper(componentModel = "spring", nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS)
public interface UserMapper {
    UserDto toDto(User entity);
    User toEntity(UserDto dto);
}
