package com.springsecurity.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.springsecurity.entity.AdminUser;
import com.springsecurity.entity.BusinessUser;
import com.springsecurity.entity.DevUser;
import com.springsecurity.repository.AdminRepository;
import com.springsecurity.repository.BusinessRepository;
import com.springsecurity.repository.DevUsersRepository;

@Service
public class UsersService {

	@Autowired
	AdminRepository adminRepository;
	
	@Autowired
	BusinessRepository businessRepository;
	
	@Autowired
	DevUsersRepository devUsersRepository;
	
	
	public DevUser saveDevData(DevUser userDev)
	{
		return devUsersRepository.save(userDev);
	}
	
	public Optional<DevUser> getDevData(Integer id)
	{
		return devUsersRepository.findById(id);
	}
	
	public List<AdminUser> getAdminData()
	{
		return adminRepository.findAll();
	}
	
	public Optional<BusinessUser> getBusinessData(Integer id)
	{
		return businessRepository.findById(id);
	}
}
