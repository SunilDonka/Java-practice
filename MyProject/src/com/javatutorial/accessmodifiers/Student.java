package com.javatutorial.accessmodifiers;

public class Student {
	public  int rollNo=101;
	
	
	
	public Student(){
		rollNo=102;// here you are changing the varible of class .
		
	}
	
	public void printRollNum() {
		System.out.println(rollNo);

	}

	
	public void abc() {
		System.out.println(rollNo); 
		printRollNum();//we can access public method in private method
	}
	
	public static void main(String[] args) {
		Student s= new Student();
	
		
		
	}
	
	

}
