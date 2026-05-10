package com.javatutorials.Interface;

public class HP implements Laptop{

	@Override
	public void copy() {
		System.out.println("HP copy code");
		
		
	}

	@Override
	public void paste() {
		System.out.println("HP paste code");
		
		
	}

	@Override
	public void cut() {
		System.out.println("HP cut code");
		
		
	}
	public void print() {
		System.out.println("HP print code");
	}

	@Override
	public void keyboard() {
		System.out.println("HP keyboard code");
		
		
	}
//	public void security() {
//		System.out.println("secure");
//	}

	@Override
	public void camera() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void makesound() {
		// TODO Auto-generated method stub
		
	}

}
