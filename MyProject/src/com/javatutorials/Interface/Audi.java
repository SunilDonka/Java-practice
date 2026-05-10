package com.javatutorials.Interface;

public class Audi implements Car,Animal{

	@Override
	public void drive() {
		System.out.println("drive is called");
	}

	@Override
	public void makesound() {
		System.out.println("hey hello");
		
	}
}
