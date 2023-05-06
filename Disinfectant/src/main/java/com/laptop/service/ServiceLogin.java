package com.laptop.service;


	import java.util.List;


	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Service;

import com.laptop.dao.RepoLogin;
import com.laptop.model.ModelLogin;



	@Service
	public class ServiceLogin {
		

			@Autowired
			private RepoLogin repository;
			
			public String checkLogin(String uname, String pwd) {
			    ModelLogin user = repository.findByuname(uname);
			    if (user == null) {
			      return "User Not Found";
			    }
			    else{
			    	if(user.getPwd().equals(pwd)) {	    		
			    		return"Login Succesfull"; 
			    	}
			    	else {
			    		return "Login Failed";
			    	}
			    }
			}
			public ModelLogin addUser(ModelLogin detol) {
				return repository.save(detol);
			}
			public List<ModelLogin> getUser()
			{
				return repository.findAll();
			}
		}

