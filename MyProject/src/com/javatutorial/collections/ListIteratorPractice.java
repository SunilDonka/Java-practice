package com.javatutorial.collections;
import java.util.*;


public class ListIteratorPractice {

	public static void main(String[] args) {
		//ListIterator -Interface
				//Introduced for iterating the all type of list objects
				//Legacy classes - v1.0+ New classes -v1.2
				//Bi direction , read and write 
		ArrayList<Integer> al= new ArrayList<>();
		al.add(5);
		al.add(85);
		al.add(78); 
		
		ListIterator<Integer>li=al.listIterator();
		while(li.hasNext()) {
			System.out.println(li.next());
		}
		li.add(45);
		System.out.println("--------------");
		while(li.hasPrevious()) {
			System.out.println(li.previous());
		}

	}

}
