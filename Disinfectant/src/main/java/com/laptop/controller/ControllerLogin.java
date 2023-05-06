package com.laptop.controller;


	import org.springframework.beans.factory.annotation.Autowired;


	import java.util.List;
	import java.util.Map;

	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.PostMapping;
	import org.springframework.web.bind.annotation.RequestBody;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RestController;

import com.laptop.model.ModelLogin;
import com.laptop.service.ServiceLogin;



	@RestController
	@RequestMapping("/detol")
	public class ControllerLogin {

		
			@Autowired
			private ServiceLogin service;
			
			  @PostMapping("/login")
			  public String login(@RequestBody Map<String, String> loginData) {
			    String uname = loginData.get("uname");
			    String pwd = loginData.get("pwd");
			    String result = service.checkLogin(uname, pwd);
			    return result;
			  }
			  @PostMapping("/adduser")
			  	public ModelLogin AddUser(@RequestBody ModelLogin game) 
			  {
				  return service.addUser(game);
			  }
			  @GetMapping
			  public List<ModelLogin> listAll()
			  {
				  return service.getUser();
			  }
	}


