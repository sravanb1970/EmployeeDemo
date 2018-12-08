package com.citibank.service;

import java.util.List;

import com.citibank.model.Employee;

public interface EmployeeService {

	public abstract void createEmployee(Employee e);
	public abstract void updateEmployeeById(int eId);
	public abstract void deleteEmployeeById(int eId);
	public abstract Employee getEmployeeById(int eId);
	public abstract List<Employee> getAllEmployees();
public abstract void updateEmployeeEmailById(String newEmail, int eId);
}
