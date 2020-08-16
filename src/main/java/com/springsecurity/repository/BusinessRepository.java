package com.springsecurity.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springsecurity.entity.BusinessUser;

public interface BusinessRepository extends JpaRepository<BusinessUser, Integer>{

}
