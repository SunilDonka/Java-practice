package com.javatutorial.Strings;

public class StBuilder {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("sunil");
//		sb.reverse();
//		sb.insert(4, "donka");
//		
//		sb.delete(0,3);
//		sb.reverse();
//		sb.capacity();
		sb.ensureCapacity(100);
	
		System.out.println(sb.capacity());
		

	}

}
