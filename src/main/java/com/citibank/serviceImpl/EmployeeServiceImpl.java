package com.citibank.serviceImpl;

import java.util.List;

import com.citibank.DAO.EmployeeDAO;
import com.citibank.model.Employee;
import com.citibank.service.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService{

	private EmployeeDAO employeeDAO;
	
	public EmployeeDAO getEmployeeDAO() {
		return employeeDAO;
	}

	public void setEmployeeDAO(EmployeeDAO employeeDAO) {
		this.employeeDAO = employeeDAO;
	}

	public void createEmployee(Employee e) {
		System.out.println("Inserted from Service");
		
	employeeDAO.createEmployee(e);	
	}

	public void updateEmployeeById(int eId) {
		employeeDAO.updateEmployeeById(eId);
	}

	public void deleteEmployeeById(int eId) {
		employeeDAO.deleteEmployeeById(eId);		
	}

	public Employee getEmployeeById(int eId) {
		return 		employeeDAO.getEmployeeById(eId);		
	}

	public List<Employee> getAllEmployees() {
	
		return 	employeeDAO.getAllEmployees();
	}

	public void updateEmployeeEmailById(String newEmail, int eId) {
		// TODO Auto-generated method stub
		
	}

}
