package com.java.CollectionsAssignment;
import java.util.*;

public class Assignment2 {

	public static void main(String[] args) {
		Object [] arr= {4,5,0,9,8,10};
		ArrayList<Integer>al=new ArrayList(Arrays.asList(arr));
		int sum=0;
		for(int i=0;i<al.size();i++) {
			if(al.get(i)%2==0) {
				sum+=al.get(i);
			}
		}
		System.out.println(sum);
		

	}

}
