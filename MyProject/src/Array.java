import java.util.Scanner;
public class Array {
	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		int size = S.nextInt();
		int[]n = new int[size];
		System.out.println("enter"+ size +"values");
		for(int i =0;i<n.length;i++)
			n[i]=S.nextInt();
		for(int i =0;i<n.length;i++)
		System.out.print(n[i]+" ");
	}

}
