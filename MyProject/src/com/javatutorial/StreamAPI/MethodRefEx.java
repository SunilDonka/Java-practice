package com.javatutorial.StreamAPI;

import java.util.Arrays;
import java.util.List;

public class MethodRefEx {

	public static void main(String[] args) {
//		List<String> names = Arrays.asList("Boy","apple","geeta","saita");
//		
//		List<String> uNames = names.stream()
//									.map(name->name.toUpperCase())
//									.toList();
//		
//		uNames.forEach((n)->System.out.println(n));
		
		 List<Integer> nums = Arrays.asList(1,3,4,2,6);
	        
	        List<Boolean> result = nums.stream()
	        .map(n->n%2==0)
	        .toList();
	        
	        
	     System.out.println(result);
	
	}

}

