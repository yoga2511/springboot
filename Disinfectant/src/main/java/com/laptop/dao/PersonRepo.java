package com.laptop.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.laptop.model.Person;

@Repository
public interface PersonRepo extends JpaRepository<Person,Long>
{

}
