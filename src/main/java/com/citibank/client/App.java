package com.citibank.client;

import java.sql.Date;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.citibank.model.Employee;
import com.citibank.service.EmployeeService;
import com.citibank.serviceImpl.EmployeeServiceImpl;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		AbstractApplicationContext con = new FileSystemXmlApplicationContext(
				"src/main/java/com/citibank/cfgs/applicationContext.xml");

		createEmployee();
		EmployeeService es = con.getBean("employeeService", EmployeeServiceImpl.class);
		employeeExtracted(es);

		System.out.println("Created successfully");

	}

	/**
	 * @param es
	 * created for adding the employee details from e object and printed the values
	 */
	private static void employeeExtracted(EmployeeService es) {
		Employee emp = es.getEmployeeById(1);
		System.out.println(emp.getFirstName());
		System.out.println(emp.getLastName());
		System.out.println(emp.getEmail());
		System.out.println(emp.getGender());
		System.out.println(emp.getSalary());
		System.out.println(emp.getDoj());
		System.out.println();
	}

	/**
	 * this is extracted method from employee
	 */
	private static void createEmployee() {
		Employee e = new Employee();
		e.setFirstName("Mike");
		e.setLastName("Thomas");
		e.setDoj(new Date(0));
		e.setGender("Male");
		e.setSalary("80000");
		e.setEmail("mikethos@gmail.com");
	}
}
