package com.javatutorial.collections;
import java.util.*;


public class QPractice {

	public static void main(String[] args) {
		// priority Queue
//		PriorityQueue<Integer> pq =new PriorityQueue<>(Comparator.reverseOrder());
		//Addition-Offer ,add
//		pq.offer(8);
//		pq.offer(2);
//		pq.add(5);
//		pq.add(7);
//		pq.add(1);
		
//		System.out.println(pq);
//		System.out.println(pq.peek());
//		System.out.println(pq.poll());
		
//	System.out.println(pq.contains(5));
		//System.out.println(pq);
		
//		for (Integer integer : pq) {
//			System.out.println(integer);	
//		}// NotRecommended
		
		//while(!pq.isEmpty()) {
			//System.out.println(pq.poll());
			
		//}
		
//		pq.clear();
//		System.out.println(pq);
		
//		while(!pq.isEmpty()) {
//			System.out.println(pq.poll());
//			}// exectutes highest integer as highest priority
		
		//Retrieval-peek
		//removal- poll,remove
		
		ArrayDeque<String> ad = new ArrayDeque<>();
		ad.add("Banana");
		ad.addFirst("cherrry");
		ad.addLast("appple");
		ad.offerFirst("kiwi");
		ad.offer("pear");
		ad.offerLast("mango");
		System.out.println(ad);
		for (String string : ad) {
			System.out.println(string);
			
		}
		System.out.println("-------------");
		while(!ad.isEmpty()) {
			System.out.println(ad.pollFirst());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	}
}


