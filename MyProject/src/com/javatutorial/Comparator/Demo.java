package com.javatutorial.Comparator;

import java.util.Comparator;
import java.util.*;

public class Demo {

	public static void main(String[] args) {
		Comparator<Integer> com = new Comparator<Integer>() {

			@Override
			public int compare(Integer i, Integer j) {
				if(i%10 > j%10)
					return 1;
				else
				return -1;
			}
		};
		List<Integer> nums = new ArrayList<Integer>();
		nums.add(54);
		nums.add(33);
		nums.add(41);
		nums.add(69);
		
		Collections.sort(nums,com);// Sorting using custom comparator
		System.out.println( nums);
		
		
		
		

	}

}
