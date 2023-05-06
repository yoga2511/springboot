package com.laptop.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.laptop.model.Address;

@Repository

public interface AddressRepo  extends JpaRepository<Address,Long>{

}
