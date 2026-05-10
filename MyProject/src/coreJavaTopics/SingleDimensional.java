package coreJavaTopics;
import java.util.Scanner;

public class SingleDimensional {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int size=s.nextInt();
		int j[]=new int[size];
	    float n =0;
	    float q=0;
	    int m =j.length;
	    for(int i=0;i<j.length;i++)
	    {
	    	j[i] = s.nextInt();
	        n=n+j[i];
	        q=n/m;
	    }
	    System.out.println(q);
	}

}
