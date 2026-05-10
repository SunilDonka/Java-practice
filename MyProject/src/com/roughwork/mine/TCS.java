package com.roughwork.mine;
import java.util.*;
public class TCS {

	public static void main(String[] args) {
		String str= "Mynameissaikumar";
		
		Map<Character,Integer> count = new LinkedHashMap<>();
		for(int i=0;i<str.length();i++) {
			char ch =str.charAt(i);
			count.put(ch,count.getOrDefault(ch,0)+1);
			
			
		}
		for(Map.Entry<Character, Integer> entry:count.entrySet() ) {
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
		
	}

}
