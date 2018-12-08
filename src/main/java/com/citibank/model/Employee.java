package com.citibank.model;

import java.sql.Date;

public class Employee {
private String firstName;
private String lastName;
private Date doj;
private String email;
private String gender;
private String salary;


public String getFirstName() {

	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public Date getDoj() {
	return doj;
}
public void setDoj(Date date) {
	this.doj = date;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public String getSalary() {
	return salary;
}
public void setSalary(String salary) {
	this.salary = salary;
}
@Override
public String toString() {
	return "Employee [ firstName=" + firstName + ", lastName=" + lastName + ", doj=" + doj + ", email="
			+ email + ", gender=" + gender + ", salary=" + salary + "]";
}

}
