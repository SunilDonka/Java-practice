import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		int res=0;
		System.out.println("Enter two numbers");
		int n1 = S.nextInt();
		int n2 = S.nextInt();
		System.out.println("1.Add");
		System.out.println("2.subtract");
		System.out.println("3.Multiply");
		System.out.println("4.Divide");
		System.out.println("Enter your choice");
		int ch = S.nextInt();
		switch (ch)
		{
			case 1: res = n1 + n2;break;
			case 2: res = n1 - n2;break;
			case 3: res = n1 * n2;break;
			case 4: res = n1 / n2;break;
			default: System.out.println("Invalid Choice");System.exit(1);	
		}
		System.out.println("result = "+res);
		
		
		


	}

}
