package com.javatutorials.exceptionhandling;

public class SunilException extends Exception{
	
	private static final long serialVersionUID = 1L;

	public SunilException(String message) {
		super(message);
	}
	

public static void main(String[] args) {
	int age =1;
		try {
			if(age <18)
				throw new SunilException("Age Restriction: "+age);
			System.out.println("Perfect Age to Watch");
		}
		catch(SunilException e) {

			System.out.println(" User is not authorised to watch "+e);
		
		}    
		
		
		
	
}
	
}

