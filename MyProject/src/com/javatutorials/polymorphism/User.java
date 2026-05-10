package com.javatutorials.polymorphism;

public class User extends methodoverriding{
	
	public void friend() {
		System.out.println("Hi friends");
		
	}
	
	@Override
	public void sunny() {
		System.out.println("Hello");
		
		
	}
	public void friends() {
		System.out.println("Hello SUnil");
		
		
	}

	public static void main(String[] args) {
		methodoverriding m = new User();
		m.friend();
		m.sunny();
		
	}

	
}
