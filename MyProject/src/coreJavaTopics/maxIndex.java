package coreJavaTopics;
import java.util.*;

public class maxIndex {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int[]a=new int[size];
		int max=a[0];
		int maxindex=0;
		for(int i=0;i<a.length;i++) {
			a[i]=s.nextInt();
			if(a[i]>max) {
				max=a[i];
				maxindex=i;
			}	
		}
		System.out.println(max);
		System.out.println("its index position is "+maxindex);
		
		

	}

}
