import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner S= new Scanner(System.in);
		int i,fact=1;
		int n =S.nextInt();
		for(i=n;i>=1;i--)
			fact=fact*i;
		System.out.println(fact);
		
	}
 
}
