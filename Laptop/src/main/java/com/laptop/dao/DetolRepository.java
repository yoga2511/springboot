package com.laptop.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.laptop.model.Detol;

@Repository
public interface DetolRepository extends JpaRepository<Detol,Integer> {

}
