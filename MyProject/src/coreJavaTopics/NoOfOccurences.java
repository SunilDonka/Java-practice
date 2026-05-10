package coreJavaTopics;
import java.util.*;

public class NoOfOccurences {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String a = s.nextLine();
		char b=s.next().charAt(0);
		int count=0;
		for(int i=0;i<a.length();i++) 
		{
			if(a.charAt(i)==b) {
				count++;	
		}	
	}
		System.out.println(count);
	}
}


