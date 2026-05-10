import java.util.Scanner;
public class BiggestNumbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n1 = scan.nextInt();
		int n2 = scan.nextInt();
		int n3 = scan.nextInt();
		if(n1 > n2 && n1 > n3)
			System.out.println("Hey the Bigger number is "+n1);
		else if(n2 >n3)
			System.out.println("Hey theBigger number is "+n2);
		else
			System.out.println("Hey the Bigger number is "+n3);
			
		// TODO Auto-generated method stub

	}

}
