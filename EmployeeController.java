package com.example.Mapping.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Mapping.Model.Employee;
import com.example.Mapping.Repository.EmployeeRepo;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeeRepo empRepo;
	
	@PostMapping("/saveEmployeesOneToOne")
	public Employee saveDetails(@RequestBody Employee e)
	{
		return empRepo.save(e);
		
	}
	
	@GetMapping("/a")
	List<Employee> show()
	{
		return empRepo.findAll();
	}

}
