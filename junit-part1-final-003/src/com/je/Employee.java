package com.je;

public class Employee {
	
	private String randomId;
	private String name;
	public String getRandomId() {
		return randomId;
	}
	public void setRandomId(String randomId) {
		this.randomId = randomId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employee [randomId=" + randomId + ", name=" + name + "]";
	}


}
