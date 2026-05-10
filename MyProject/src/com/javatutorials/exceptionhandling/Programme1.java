package com.javatutorials.exceptionhandling;

public class Programme1 {
	
	public static void method1() {
		System.out.println("program exexcution starts");
		int i =9;
		int j=0;
		int k = 0;
		try {
			k=i/j;	
		}
		catch(ArithmeticException ae){
			System.out.println(ae.toString());// write a logic to enter this message into log files
			
		}
		finally {
			System.out.println("finally block");
		}
	
		System.out.println("output:"+k);
		System.out.println("program execution ends");
		
	}

	public static void main(String[] args) {
		method1();
		
		
		

	}

}
