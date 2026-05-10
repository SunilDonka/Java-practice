package com.javatutorial.StreamAPI;

import java.util.EnumSet;
import java.util.*;

public class ParallelStreams {

	public static void main(String[] args) {
		List<Integer> nums = new ArrayList<>(10000);
		int size =10000;
		Random ran = new Random();
		
		for(int i =0;i<=size;i++) {
			nums.add(ran.nextInt(100));
		}
		
		int sum = nums.stream()
				.map(i->i*2)
				.reduce(0,(c,e)->(c+e));// using reduce() method
		
		long startSeq = System.currentTimeMillis();
		int sum2 = nums.stream()
				.map(i->i*2)
				.mapToInt(i -> i)
				.sum(); // using mapToInt() method for getting the sum values 
		long endSeq = System.currentTimeMillis();
		
		long startPara = System.currentTimeMillis();
		
		int sum3 = nums.parallelStream()
				.map(i->i*2)
				.mapToInt(i -> i)
				.sum();// using paralle streams for getting the values 
		long endPara = System.currentTimeMillis();
		//any one of the method returns the values in an efficient way 
		
		System.out.println(sum+"  "+sum2+"  "+sum3);
		
		System.out.println("sequential:"+(endSeq - startSeq));
		
		System.out.println("Parallel:"+(endPara - startPara));
		
	}

}
