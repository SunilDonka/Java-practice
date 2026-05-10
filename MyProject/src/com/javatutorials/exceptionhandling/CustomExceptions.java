package com.javatutorials.exceptionhandling;

public class CustomExceptions extends Exception {

	

	public CustomExceptions(String Message){
		super(Message);	
	}

	public static void main(String[] args)  {
		int length=39;
		
		try {
			if(length <=35)
				throw new CustomExceptions("Given length not matches");
		}
		catch(CustomExceptions e) {
			System.err.println("Hey check the length dude ");
		}

	}

}
