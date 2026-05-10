package com.javatutorials.exceptionhandling;

public class exception {
	
	public static void method1() {
		String s ="sunil";
		String s1="";
		char ch;
		try {
			for(int i=0;i<s.length();i++) {
				ch=s.charAt(i);
				s1=ch+s1;
				
			}
			System.out.println(s1);
		}
		catch(IndexOutOfBoundsException ie) {
			ie.printStackTrace();
			
		}
		finally {
			System.out.println("code execution ends");
		}
		
	}
	
	
	public static void main(String[] args) {
		method1();
		
		
		
	}

}
