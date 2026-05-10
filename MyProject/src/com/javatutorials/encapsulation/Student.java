package com.javatutorials.encapsulation;

public class Student {
	private int rollNumber;
	private String name;
	private boolean isAttended ;
	
	public Student(int rollNumber) {
		this.rollNumber=rollNumber;
		
	}
	public void setAttendance(boolean flag) {
		if(!isAttended)
		isAttended = flag;
		System.out.println("Teacher assigned attendance to student");
		
	}
	
	public boolean getAttendance() {
		System.out.println("Teacher accessed student");
		return isAttended;
		
		
	}

}
