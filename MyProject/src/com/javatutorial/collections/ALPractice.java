package com.javatutorial.collections;

import java.util.*;

public class ALPractice {

	public static void main(String[] args) {
		
		List<Integer> l = Arrays.asList(1,2,3,4,5);
		
		
		Iterator<Integer > nums = l.iterator();
		while(nums.hasNext()) {
			System.out.println(nums.next());
		}
		
		
}
  





}













//Map<String,Integer> Students= new HashMap<>();
//Students.put("sunil",23);
//Students.put("patil",32);
//Students.put("rahul",54);
//Students.put("sardul",23);
//
////System.out.println(Students.keySet());
////
//
//for (String s :Students.keySet() ) {
//System.out.println(s+" : "+Students.get(s));
//
//}
//	}




//Set<Integer> nums = new TreeSet<Integer>();
//nums.add(62);
//nums.add(54);
//nums.add(82);
//nums.add(21);
//nums.add(8);
//
//
//for(int i :nums) {
//	System.out.println(i);}
//




//	Integer[] arr= {1,5,8,9,2};
//ArrayList<Integer> al1 = new ArrayList<>(Arrays.asList(arr));
////al1.add(2);
////al1.add(0,8);
////al1.remove(4);
//System.out.println(al1);
////System.out.println(al1.get(2));
//
////for(int i=0;i<al1.size();i++) {
////	System.out.print(al1.get(i)+" ");// Traditional ForLoop
////}
//for(Integer integer:al1) {
//	System.out.print(integer+" ");// Enhanced ForLoop (or) Foreach
//}
//