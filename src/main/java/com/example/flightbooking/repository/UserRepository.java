package com.example.flightbooking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.flightbooking.model.User;
/*
 * User Repository
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
