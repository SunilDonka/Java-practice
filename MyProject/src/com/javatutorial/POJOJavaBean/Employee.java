package com.javatutorial.POJOJavaBean;

public class Employee {
	private int id;
	public String name;
	protected double salary;
	
	public Employee(int id) {
		this.id=id;
	}//parameterised constructor or argumented constructor
	
	public Employee() {
//		System.out.println("No arg constructor is called");
	}// Paremetreless constructor 

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public double getsalary() {
		return salary;
	}

	public String getname() {
		return name;
	}

}
