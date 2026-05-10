import java.util.Scanner;
public class SumOfNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int n,i=1,sum=0;
		while(i <= 10)
		{
			System.out.println("Enter a number");
			n=s.nextInt();
			sum = sum + n;
			i++;
		}
		System.out.println("Sum= "+sum);

	}

}
