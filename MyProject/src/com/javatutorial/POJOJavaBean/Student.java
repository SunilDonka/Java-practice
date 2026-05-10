package com.javatutorial.POJOJavaBean;

import java.io.Serializable;

public class Student implements Serializable{
	
	private int id;
	private String name;
	private double marks;
	
	public Student() {
		
	}
// This is No arg constructor 
	
	public Student (int id,String name) {
		this .id=id;
		this.name=name;
		
	}
// This is parameterised constructor (or)Args constructor which means not a java bean class

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}


}
