package com.email.model;

public class Employee {
	String firstName;
	String lastName;
	
	public Employee(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public void setFirstName(String firstName) {
		 this.firstName = firstName;
	}
	
	public void setLastName(String lastName) {
		 this.lastName = lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	} 

}
