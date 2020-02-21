package com.nttdata.springboottesting.interfaces;

import java.util.List;
import java.util.UUID;

import com.nttdata.springboottesting.model.Employee;

public interface EmployeeDao {

	boolean insertEmployee(UUID id, Employee emp);
	
	default boolean insertEmployee(Employee emp) {
		UUID id = UUID.randomUUID();
		return insertEmployee(id, emp);
	}

	Employee retrieveEmployeeFromDb();

	List<Employee> retrieveAllEmployeesFromDb();

	boolean updateEmployeeInDb();

	boolean deleteEmployeeFromDb();

}
