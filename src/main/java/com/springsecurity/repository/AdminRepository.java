package com.springsecurity.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springsecurity.entity.AdminUser;

public interface AdminRepository extends JpaRepository<AdminUser, Integer>{

}
