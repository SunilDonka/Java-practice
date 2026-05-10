package com.javatutorial.collections;
import java.util.*;

public class StPracrice {

	public static void main(String[] args) {
		Stack<String> s1= new Stack<>();
		s1.push("Red");
		s1.push("black");
		s1.push("white");
		s1.push(null);
		s1.push("white");
	System.out.println(s1);
	System.out.println(s1.search("white"));
	System.out.println(s1.indexOf("white"));
	
	System.out.println(s1);
		

		

	}

}
