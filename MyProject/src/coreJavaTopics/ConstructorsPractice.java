package coreJavaTopics;
import java.util.Scanner;

public class ConstructorsPractice 
{

	public static int amount(int amount){
		return amount;
		// Parameterized constructor
	}
	
	public int price() {
		int a=34;
		return a;
		// default constructor
	}
	public static void sunil() {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b=	s.nextInt();
		int c=a+b;
		System.out.println(c);
	}
	public static void ram() {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b=	s.nextInt();
		if(a>b) 
			System.out.println(a+" is greater");
		else {
			System.out.println(b+" is greater");
		}
		
	}
	public static void main(String[] args) {
		System.out.println(amount(45));
		ConstructorsPractice cp = new ConstructorsPractice(); 
		System.out.println(cp.price());
		System.out.println("To add the numbers here");
		sunil();
		System.out.println("if you want to know which number is greater you can check");
		ram();
		
	}

}
