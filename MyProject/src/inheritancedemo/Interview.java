package inheritancedemo;
import java.util.*;

public class Interview {

	public static void main(String[] args) {
		
		String s1="the sky is blue";
		
		String [] words=s1.split(" ");
		StringBuilder reverse =new StringBuilder();
		for(int i=words.length-1;i>=0;i--) {
			reverse.append(words[i]);
			if(i!=0) {
				reverse.append(" ");	
			}	
		}
		
		System.out.println(reverse);		
	}

}
