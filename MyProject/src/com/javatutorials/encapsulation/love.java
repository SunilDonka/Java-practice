package com.javatutorials.encapsulation;

public class love {
	public static void main(String[] args) {
		Arranged a = new Arranged();
		//a.name="sunil"//this cause error due to private modiefier //
		a.setAge(25);
		System.out.println(a.getAge());
		
		
	}

}
