package com.example.Mapping.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Mapping.Model.Employee;
@Repository

public interface EmployeeRepo extends JpaRepository<Employee,Integer> {

}
