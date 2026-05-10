package com.javatutorials.Interface;

public class User {
	public static void main(String[] args) {
		 Lenova l  = new Lenova();
		l.copy();
		l.camera();
//		Lenova.security();
		l.makesound();
		l.audio();// By using static keyword in interface we can call directly with the class name 
		HP h = new HP();
		h.paste();
		h.print();
//		h.security();
		
		
	Dog d = new Dog();
	d.makesound();
	// calling a method 
	
	Apple ap = new Apple();
	ap.makesound();
	
	Audi a = new Audi();
	a.drive();
	a.makesound();
	
	
		
	}

}
