package com.javatutorial.StreamAPI;

import java.util.*;

public class OPtionalClass {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Navin","Lakshmi","Rahul","Krishna");
		
		
		String name = names.stream()
				.filter(str -> str.contains("x"))
				.findFirst()
				.orElse("Not Found");
		System.out.println(name);
		 
		
	} 

}
