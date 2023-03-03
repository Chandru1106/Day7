package com.example.Mapping.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Mapping.Model.Address;

@Repository
public interface AddressRepo extends JpaRepository<Address,Integer>{

}
