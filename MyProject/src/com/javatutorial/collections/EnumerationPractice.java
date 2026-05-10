package com.javatutorial.collections;
import java.util.*;

public class EnumerationPractice {

	public static void main(String[] args) {
		//enumeration-Interface
		//Introduced for iterating the legacy collection obejcts
		//legacy classes -v1.0
		//HashTable,Stack,Vector,Dictionary and properties(relation to collections due to it implement hashtable)
		Vector<String> v1= new Vector<>();
		v1.add("banana");
		v1.add("cherry");
		v1.add("mango");
		v1.add("apple");
		
		//e.hasMoreElements
		//e.nextElement
		Enumeration<String> e=v1.elements();
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		Properties prop= new Properties();
		prop.setProperty("url","localhost");
		prop.setProperty("username", "admin");
		System.out.println(prop);
		
		
	
		
	}

}
