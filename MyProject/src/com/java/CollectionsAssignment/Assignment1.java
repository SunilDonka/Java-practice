package com.java.CollectionsAssignment;
import java.util.*;


public class Assignment1 {

	public static void main(String[] args) {
		Object []arr= {4,5,0,9,8,10};
		Vector<Integer> v1 = new Vector(Arrays.asList(arr)); 
		int sum=0;
		 double avg=0;
		for(int i=0;i<v1.size();i++) {
			sum=sum+v1.get(i);
			avg=sum/v1.size();
		}
		
		System.out.println("sum= "+sum);
		System.out.println("avg= "+avg);
	
	}

}
