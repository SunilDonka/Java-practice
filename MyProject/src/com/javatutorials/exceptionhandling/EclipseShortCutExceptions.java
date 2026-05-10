package com.javatutorials.exceptionhandling;

public class EclipseShortCutExceptions {

	public static void main(String[] args) {
		try {
			int [] a= {1,2,3};
			System.out.println(a[2]/0);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("main");
		

	}

}
