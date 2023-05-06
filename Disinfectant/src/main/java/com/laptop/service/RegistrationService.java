package com.laptop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.laptop.dao.RegistrationRepo;
import com.laptop.model.RegistrationModel;



@Service
	public class RegistrationService 
	{
	    @Autowired
	    RegistrationRepo yoga;
		public RegistrationModel saveRegistration(RegistrationModel r) 
		{
			return yoga.save(r);
		}
		public List<RegistrationModel> getAllUsers() 
		{
			 List<RegistrationModel> obj = yoga.findAll();
		      return obj;
		}
	}

