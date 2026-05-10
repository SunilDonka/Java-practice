package com.javatutorial.Strings;

public class Test {

	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer("Sunil");
		StringBuffer sb2 = new StringBuffer("Sunil");
		System.out.println(sb1=sb2);
		
		sb1= sb1.append("donka");
		System.out.println(sb1=sb2);
		
		StringBuffer sb3 = new StringBuffer("Sunildonka");
		System.out.println(sb1==sb3);
		
System.out.println("----------------------------------------");
		
		String s1= "sunil";
		String s2= "sunil";
		System.out.println(s1==s2);
		// Operations
		s1= s1+ "donka";
		
		System.out.println(s1==s2);
		
		String s3 =" sunil kumar";
		System.out.println(s1==s3);
		
	

	}

}
