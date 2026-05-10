package coreJavaTopics;
import java.util.*;
public class createArray {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the size of array");
		int size=s.nextInt();
		System.out.println("enter "+size+" values");
		int n[]=new int[size];
		for(int i=0;i<n.length;i++) {
			n[i]=s.nextInt();
			System.out.println("given array elements");
			for(int j=0;j<n.length;i++)
			System.out.println();
		}
	}


}
