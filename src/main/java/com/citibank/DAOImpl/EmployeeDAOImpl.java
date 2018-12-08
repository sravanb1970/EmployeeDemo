package com.citibank.DAOImpl;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.citibank.DAO.EmployeeDAO;
import com.citibank.model.Employee;

public class EmployeeDAOImpl implements EmployeeDAO{
private DataSource dataSource;
private JdbcTemplate jdbcTemplate;

private static final String INSERT="INSERT INTO EMPLOYEE(FIRST_NAME,LAST_NAME,DOJ,EMAIL,GENDER,SALARY)VALUES(?,?,?,?,?)";
	public void setDataSource(DataSource dataSource) {
	this.dataSource = dataSource;
this.jdbcTemplate	=new JdbcTemplate(dataSource);
}
	public void createEmployee(Employee e) {
		System.out.println("started from DAO");
		
		jdbcTemplate.update(INSERT, new Object[] {e.getFirstName(),e.getLastName(),e.getDoj(),e.getEmail(),e.getGender(),e.getSalary()})	;	
	System.out.println("Inserted from DAO");
	
	}

	public void updateEmployeeById(int eId) {
		
	}

	public void deleteEmployeeById(int eId) {
		
	}

	public Employee getEmployeeById(int eId) {
		return null;
	}

	public List<Employee> getAllEmployees() {
		return null;
	}

}
