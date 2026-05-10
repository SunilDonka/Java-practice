import java.util.Scanner;
public class BigNumbers {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n,i=1,big=0;
		// TODO Auto-generated method stub
		while(i<=5)
		{
			n =s.nextInt();
			if(n>big)
				big = n;
			i++;
			
		}
		System.out.println("Big = "+big);

	}

}
