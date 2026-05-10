package com.javatutorials.polymorphism;

public class Calculations {
	
	public void  add(int a , int b) {
		int c=a+b;
		
		System.out.println(c);
		
		
	}
	
	public void add(int a, String name,int c) {
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				System.out.print("7");
			}
			System.out.println("*");
		}
		
	}
	
	public static void main(String[] args) {
		Calculations c = new Calculations();
		c.add(2,5);
		c.add(2,"ram",5);
		
		
	}

}
