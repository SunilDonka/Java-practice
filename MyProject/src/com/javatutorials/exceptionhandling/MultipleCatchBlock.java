package com.javatutorials.exceptionhandling;

public class MultipleCatchBlock {

	public static void main(String[] args) {
	try {
		int []a= {1,2,3};
		System.out.println(a[1]);
		System.exit(0);
	}catch(ArrayIndexOutOfBoundsException|ArithmeticException e) {
		e.printStackTrace();
		System.out.println("Please use index with in the range");
	}
	
//	catch(ArithmeticException e2) {
//		e2.printStackTrace();
//		System.out.println("please don't divide the number with zero");
//	}
//	catch(Exception e3) {
//		e3.printStackTrace();
//	}
	finally {
		System.out.println("finally");
	}
	
	}

}
