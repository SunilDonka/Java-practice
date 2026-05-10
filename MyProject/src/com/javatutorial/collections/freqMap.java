package com.javatutorial.collections;
import java.util.*;

public class freqMap {

	public static void main(String[] args) {
		List<String> freqWord= Arrays.asList("apple","apple","orange","banana","orange","apple","orange","books");
		
		// occurrences 
		TreeMap<String,Integer> freqWordCount= new TreeMap<>();
		for (String word : freqWord) {
			freqWordCount.put(word,freqWordCount.getOrDefault(word,0)+1);
		}
		

		// using entrySet() to iterate through map
		for(Map.Entry<String,Integer> entry : freqWordCount.entrySet()){
			System.out.println(entry.getKey()+":"+entry.getValue());
	
		}	
	}

}
