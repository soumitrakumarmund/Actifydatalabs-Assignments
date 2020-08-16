package com.springsecurity.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springsecurity.entity.DevUser;

public interface DevUsersRepository extends JpaRepository<DevUser, Integer> {

}
