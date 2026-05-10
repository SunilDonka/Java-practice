package com.javatutorials.Interface;

public class User1 {

	public static void main(String[] args) {
		Car c= new Car() 
		{
			public void drive() {
				System.out.println("drive is called");
			}	
		};// Anonymous class ( it will implement functional interface)
		c.drive();
	}

}
