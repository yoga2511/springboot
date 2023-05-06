package com.laptop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.laptop.dao.PersonRepo;
import com.laptop.model.Person;

@Service
public class PersonAddressService {
	@Autowired
	PersonRepo obj;
	public List<Person>fetchAllPersons()

	   {

		   return obj.findAll();

	   }

 public Person savePersons(Person p)

	   {

		   return obj.save(p);

	   }


}
