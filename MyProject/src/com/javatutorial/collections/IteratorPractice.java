package com.javatutorial.collections;
import java.util.*;

public class IteratorPractice {

	public static void main(String[] args) {
		//Iterator -Interface
		//Introduced for iterating the all collection objects
		//Legacy classes - v1.0+ New classes -v1.2
		//one direction , read only with special permission for removing the elements
		
		ArrayList<Integer> al= new ArrayList<>();
		al.add(5);
		al.add(85);
		al.add(78); 
		
		Iterator<Integer> i = al.iterator();
		//i.hasNext()
		//i.next()
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	
		HashMap<String,Integer> hm=new HashMap<>();
		hm.put("India",500);
		hm.put("Srilanka", 600);
		hm.put("London", 1000);
		
		hm.keySet().iterator();
		hm.values().iterator();
		hm.entrySet().iterator();
		// we can't handle directly with maps directly , we can do by iterate only
	}

}
