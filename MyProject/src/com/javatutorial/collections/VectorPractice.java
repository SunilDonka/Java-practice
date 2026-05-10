package com.javatutorial.collections;

import java.util.*;

public class VectorPractice {

	public static void main(String[] args) {
		// size = no of elements present in list
		// Capacity = Array capacity
//		Object[] arr = {1,5,8,9,2};
		
		Vector <String>v1 = new Vector<>();
//	Vector<String> v2 = new Vector(Arrays.asList(arr)); 
		
		v1.add("sunil");
		v1.add("jeevan");
		v1.add(0,"raj");
		
		Vector <String>v3 = new Vector<>();
		v3.add("ramesh");
		v3.add("suresh");
		
//		System.out.println(v1);
		
		v1.addAll(0, v3);// we are giving index position as 0
		//so the data sits in first and followed by other data .
		
//		for(int i=0;i<v2.size();i++) {
//			v1.add(v2.get(i));
//		}
	
//		System.out.println(v1);
//		System.out.println(v1.get(2));
		v1.remove(0);
		v1.remove("raj");
		v1.removeAll(v3);
		v1.add("raj");
//		v1.contains("raj");
//		System.out.println(v1.contains("raja"));
//		System.out.println(v1.set(1,"satish"));
//		System.out.println(v1);
		System.out.println("capacity of array is: "+v1.capacity());
		Object[] asp = v1.toArray();
		System.out.println(Arrays.toString(asp));
//		System.out.println(v2);
//		System.out.println(v2.size());
//		System.out.println(v2.capacity());
	}

}
