package com.nttdata.springboottesting.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nttdata.springboottesting.model.Employee;
import com.nttdata.springboottesting.service.EmployeeService;

@RequestMapping("/api/v1/employee")
@RestController
public class EmployeeController {
	
	private  EmployeeService employeeService;

	
	
	@Autowired
	public EmployeeController(EmployeeService employeeService) {
		super();
		this.employeeService = employeeService;
	}
	
	@PostMapping
	public void insertEmployee(@RequestBody Employee emp) {
		employeeService.insertEmployee(emp);
	}
	

}
