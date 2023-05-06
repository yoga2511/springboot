package com.laptop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.laptop.model.RegistrationModel;
import com.laptop.service.RegistrationService;


@RestController
public class RegistrationController {

	
	@Autowired
    RegistrationService yogs;
    @PostMapping("/registereduser")
    public RegistrationModel saveRegistration(@RequestBody RegistrationModel r)
    {
  	  return yogs.saveRegistration(r);
    }
    @GetMapping("/fetchalldata")
    public List<RegistrationModel> getAllUsers()
    {
   	 List<RegistrationModel> obj = yogs.getAllUsers();
   	 return obj;
    }
}
