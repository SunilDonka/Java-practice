package com.roughwork.mine;

import java.util.Arrays;
import java.util.stream.*;
import java.util.*;

public class Practice2 {

	public static void main(String[] args) {
		 String str ="Hey hi this is hi and this is java";
		 
		 String []word=str.split(" ");
		 
	      Map<String,Integer> count = new TreeMap<>();
	     for(String s:word) {
	    	
	    	 count.put(s, count.getOrDefault(s,0)+1);
	    	 
	     }
	    	
	      for(Map.Entry<String,Integer> entry : count.entrySet()){
	          if(entry.getValue()==1){
	              System.out.println(entry.getKey());
	              
	          }
	      }
	   
	}

}
