package com.nttdata.springboottesting.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Repository;

import com.nttdata.springboottesting.interfaces.EmployeeDao;
import com.nttdata.springboottesting.model.Employee;




@Repository("daoImpl")
public class EmployeeDaoImpl implements EmployeeDao {

	private static List<Employee>DB = new ArrayList<>();
	
	@Override
	public boolean insertEmployee(UUID id, Employee emp) {
		DB.add(new Employee(emp.getName(), id));
		System.out.println("Dao Layer called");
		return true;
	}

	@Override
	public Employee retrieveEmployeeFromDb() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> retrieveAllEmployeesFromDb() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean updateEmployeeInDb() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteEmployeeFromDb() {
		// TODO Auto-generated method stub
		return false;
	}

}
