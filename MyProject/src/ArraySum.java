import java.util.Scanner;
public class ArraySum {
	public static void main(String[] args) 
	{
		Scanner S = new Scanner (System.in);
		int sum =0;
		int size=S.nextInt();
		int[]n=new int[size];
		for(int i=0;i<n.length;i++)
		{
			n[i]=S.nextInt();
			sum= sum +n[i];
		}
		System.out.println(sum);	
	}
}
