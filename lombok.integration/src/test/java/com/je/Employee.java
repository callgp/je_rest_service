package com.je;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class Employee {

	private String firstName;
	private String lastName;
	/*
	 * public String getFirstName() { return firstName; } public void
	 * setFirstName(String firstName) { this.firstName = firstName; } public String
	 * getLastName() { return lastName; } public void setLastName(String lastName) {
	 * this.lastName = lastName; }
	 */
}
