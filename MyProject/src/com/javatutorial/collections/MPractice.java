package com.javatutorial.collections;
import java.util.*;
import java.util.Map.Entry;

public class MPractice {

	public static void main(String[] args) {
		
	// Creation of a map
		Map<Integer,String> m=new Hashtable<>();
//		
	// Addition of elements into the map
		m.put(75689, "chennai");
		m.put(63904, "hyderabad");
		m.put(67894, "vizag");
//		//retrieval of  keys from map
	Set<Integer> keys= m.keySet();
	for (Integer key : keys) {
		System.out.println(key);
//	}
//		//retrieval of values from the map
	Collection<String>values =  m.values();
	
	for (String string : values) {
		System.out.println(string);	
	}
//	
//		// retrival of values from map by using keys
//	System.out.println("values of key :"+m.get(67894));
//		
		//retrival of all keys and values by using keys
//	for (Integer key : keys) {
//		System.out.println(key +">>>" +m.get(key));
	}
//	
//	System.out.println(m);
//	
//	//Deletion of elements from map
//	m.remove(67894);
//	m.remove(63904,"hyderabad");
//	System.out.println(m);
//	// Verify the elemets from the map for keys and values 
//	System.out.println(m.containsKey(67894));
//	System.out.println(m.containsValue("hyderabad"));
//	
//	//Update the elements from the map
////	
	
	Set<Entry<Integer,String>>entries =m.entrySet();
	for (Entry<Integer, String> entry : entries) {
		Integer key = entry.getKey();
		String value=entry.getValue();
		System.out.println(key +" >> "+ value);
	}
	
	
	}
	
}
