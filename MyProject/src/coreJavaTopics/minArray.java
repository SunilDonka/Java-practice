package coreJavaTopics;
import java.util.*;
public class minArray {
	public static void main(String[] args) {
		String[]a= {"sun","lokesh","rajesh","priya"};
	int min =a[0].length();
		   String m=a[0];
		   int minindex=0;
		   for(int i =0;i<a.length;i++) {
		       if(a[i].length()<min){

		           min=a[i].length();
		           m=a[i];
		           minindex=i;
		       }
		   }
		   System.out.println(m);
		   System.out.println("index "+minindex);
		
		
	}

}
