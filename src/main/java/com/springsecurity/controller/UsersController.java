package com.springsecurity.controller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.springsecurity.entity.AdminUser;
import com.springsecurity.entity.BusinessUser;
import com.springsecurity.entity.DevUser;
import com.springsecurity.service.UsersService;

@RestController
@RequestMapping("/User")
public class UsersController {
	
	@Autowired
	UsersService usersservice;
	
	@GetMapping(value="/admin/getUserList/{id}")
	public List<AdminUser> getAdmin()
	{
		return usersservice.getAdminData();
	}
	
	@GetMapping(value="/dev/getMyTranasction/{id}")
	public Optional<DevUser> getId(@PathVariable(value="id") Integer id)
	{
		return usersservice.getDevData(id);
	}
	
	@PostMapping(value="/dev/insertMyTransaction")
	public String addData(@RequestBody DevUser userDev)
	{
		usersservice.saveDevData(userDev);
		return "Data Inserted Successfully";
	}
	
	@GetMapping(value="/business/getMyReport/{id}")
	public Optional<BusinessUser> getBusinessId(@PathVariable(value="id") Integer id)
	{
		return usersservice.getBusinessData(id);
	}
	

}
