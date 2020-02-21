package com.nttdata.springboottesting.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.nttdata.springboottesting.interfaces.EmployeeDao;
import com.nttdata.springboottesting.model.Employee;



@Service
public class EmployeeService {
	
	private final EmployeeDao EMPLOYEE_DAO;
	
	@Autowired
	public EmployeeService(@Qualifier("daoImpl")EmployeeDao employeeDao) {
		super();
		this.EMPLOYEE_DAO = employeeDao;
	}

	public boolean insertEmployee(Employee emp) {
		return EMPLOYEE_DAO.insertEmployee(emp);
		
	}
	
}
