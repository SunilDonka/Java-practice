package com.javatutorial.collections;
import java.util.*;
public class SetPractice {

	public static void main(String[] args) {
		//Hashset
//		LinkedHashSet<Integer> hs=new LinkedHashSet<>();
		TreeSet<Integer> hs=new TreeSet<>();
		hs.add(10);
		hs.add(2);
		hs.add(85);
		hs.add(65);
		hs.add(5);
		hs.add(5);
		hs.add(85);
//		HashMap<Integer,String>hm=new HashMap<>();
//		System.out.println(hs.remove(85));
		System.out.println(hs.contains(5));
		System.out.println(hs.contains(850));
		for (Integer integer : hs) {
			System.out.println(integer);
			
		}
		System.out.println(hs);
		System.out.println(hs.first());
		System.out.println(hs.last());
		System.out.println(hs.pollFirst());
		System.out.println(hs.pollLast());
		System.out.println(hs.subSet(4,65));
		System.out.println(hs.descendingSet());// Big to small
		
		System.out.println(hs);

	}

}
