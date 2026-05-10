package com.javatutorials.Interface;

public class Student extends SampleAC{
//	public abstract void ram(); 
//	
//	public abstract void sita();

	public void student() {
		System.out.println("student marks are");
	}
	
	 public void age()  {
		System.out.println("student age");
		
	}
	 
	 
	 
	 public static void main(String[] args) {
		SampleAC a = new Student();
		a.student(" jack");
		
		
	}

	@Override
	public void marks() {
		// TODO Auto-generated method stub
		
	}

	
	
}
