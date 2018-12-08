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
public class App 
{
    public static void main( String[] args )
    {
  AbstractApplicationContext con=new FileSystemXmlApplicationContext("src/main/java/com/citibank/cfgs/applicationContext.xml");

  Employee e=new Employee();
  e.setFirstName("Mike");
  e.setLastName("Thomas");
    e.setDoj(new Date(0));
    e.setGender("Male");
    e.setSalary("80000");
    e.setEmail("mikethos@gmail.com");
EmployeeService es=new EmployeeServiceImpl();

es.createEmployee(e);
System.out.println("Created successfully");
    
    
    }
}
