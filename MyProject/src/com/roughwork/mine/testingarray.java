package com.roughwork.mine;

import java.util.Arrays;

public class testingarray {
	public int[] ArraysSorting(int[] array) {
		Arrays.sort(array);
		return array;
	}

	public static void main(String[] args) {
		testingarray array = new testingarray();
		try {

			int[]unsorted = {2,5};
			array.ArraysSorting(unsorted);
			for ( int i : unsorted) {
				System.out.print(i+" ");	
			}

		}
		catch(NullPointerException e) {
			System.out.println("exception generated");

		}
	}

}
