package com.laptop.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.laptop.model.RegistrationModel;

@Repository
public interface RegistrationRepo extends JpaRepository<RegistrationModel,Integer>{

}
