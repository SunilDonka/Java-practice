import java.util.Scanner;
public class Mtable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner (System.in);
		int n=s.nextInt();
		for(int i =1;i<=20;i++)
		{
			int p=n*i;
			
		System.out.println(n+"*"+i+"="+p);
		}

	}

}
