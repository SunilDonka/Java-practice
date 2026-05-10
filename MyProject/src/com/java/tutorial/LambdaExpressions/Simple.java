package com.java.tutorial.LambdaExpressions;
import java.util.*;

public class Simple {

	public static void main(String[] args) {
		List<String> fruits = new ArrayList<>();


		fruits.add("apple");
		fruits.add("banana");
		fruits.add("Orange");
		fruits.add(3,"grape");// adding the elemnt 

		fruits.forEach((str)->{System.out.println(str);});

		fruits.remove(0);

		

		System.out.println("--------------------------------");
		fruits.forEach((str)->{System.out.println(str);});

		System.out.println("------------");

		System.out.println(fruits.get(2));


		
		List<Integer> numbers = new LinkedList<>();
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		
		
		System.out.println(numbers);
		
		numbers.add(2,25);
		
		System.out.println(numbers);
		System.out.println("-------------------");
		
		numbers.remove(3);
		
		System.out.println("Updatednumbers:"+numbers);
		
		System.out.println("-------------------");
		
		System.out.println(numbers.get(0));
		
		
		System.out.println("-------------------");
		
	List<String> fruits1= new ArrayList<>();
	
	
	fruits1.add("apple");
	fruits1.add("Orange");
	fruits1.add("grape");
	fruits1.add("Banana");
	
	for (String str : fruits1) {
		System.out.println(str);
		
	}
	
	String searchFruit ="Banana";
	if(fruits1.contains(searchFruit)) {
		System.out.println(searchFruit +" foundat index "+ fruits1.indexOf(searchFruit) );
	}
	else {
		System.out.println(searchFruit+" notFound");
	}
	
	fruits.sort(null); // Natural order (alphabetical)
    System.out.println("\nSorted fruits:");
    fruits.forEach(System.out::println);
    
    
	
    HashMap<Integer,Integer> hm= new HashMap<>();
    
    hm.put(3,9);
    
    int n=7;
    if(hm.containsKey(n)){
        int prev= hm.get(n);
        hm.put(n,prev+1);
    }else{
        hm.put(n,1);
    }
    
    System.out.println(hm.get(7));
 }	

    
    
	}

