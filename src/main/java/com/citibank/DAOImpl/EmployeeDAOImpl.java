package com.citibank.DAOImpl;

import java.sql.Date;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.citibank.DAO.EmployeeDAO;
import com.citibank.model.Employee;

public class EmployeeDAOImpl implements EmployeeDAO {
		private DataSource dataSource;
		private JdbcTemplate jdbcTemplate;
	
		private static final String INSERT = "INSERT INTO EMPLOYEE(FIRST_NAME,LAST_NAME,DOJ,EMAIL,GENDER,SALARY)VALUES(?,?,?,?,?,?)";
		private static final String SELECTBYID = "SELECT * FROM EMPLOYEE WHERE ID=?";
	
		public void setDataSource(DataSource dataSource) {
			this.dataSource = dataSource;
			this.jdbcTemplate = new JdbcTemplate(dataSource);
		}
	
		public void createEmployee(Employee e) {
			System.out.println("started from DAO");
	
			jdbcTemplate.update(INSERT, new Object[] { e.getFirstName(), e.getLastName(), e.getDoj(), e.getEmail(),
					e.getGender(), e.getSalary() });
			System.out.println("Inserted from DAO");
	
		}
	
		public void updateEmployeeById(int eId) {
	
		}
	
		public void deleteEmployeeById(int eId) {
	
		}
	
		public Employee getEmployeeById(int eId) {
			Employee emp = jdbcTemplate.queryForObject(SELECTBYID, new EmployeeRowMapper(), eId);
	
			return emp;
		}
	
		public List<Employee> getAllEmployees() {
			String QUERY1="SELECT * FROM EMPLOYEE";
			List<Employee> e=jdbcTemplate.query(QUERY1, new EmployeeRowMapper());
			return e;
		}
	}

