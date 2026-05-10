package com.javatutorials.exceptionhandling;

public class ThrowsException {
	
	public void show() throws ClassNotFoundException {
		Class.forName("com.javatutorials.exceptionhandling.ThrowsException");
		
	}

	public static void main(String[] args) {
		ThrowsException th = new ThrowsException();
		try {
			th.show();
			System.out.println("Class loaded successfully!");
		} catch (ClassNotFoundException e) {
			System.err.println("class not found:  "+e.getMessage());
			e.printStackTrace();
		}
		

	}

}
