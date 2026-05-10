package com.java.learning;

public class ReverseString {

	public String reverseString(String str) {
	String s1="";
		char ch;
		for(int i=0;i<str.length();i++) {
			ch=str.charAt(i);
			s1=ch+s1;
		}
		return new String(s1);
	}

	

	

}
