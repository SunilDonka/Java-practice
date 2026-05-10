import java.util.*;
public class Bank {
	
	public static int currentBalance=1000;
	
	public static void greetCustomer() {
		System.out.println("Hello , Welcome to banking ");
	}
	public void deposit(int amount) {
		currentBalance=currentBalance+amount;
		System.out.println("Amount deposited successfully");
		
	}
	public static void withdrawl(int amount) {
		currentBalance=currentBalance-amount;	
		System.out.println("Amount withdrawl successfully");
	}

	public int getCurrentBalance() {
		return currentBalance;
	}
	
	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		greetCustomer();
		Bank bank= new Bank();
		System.out.println("current balance is:"+bank.getCurrentBalance());
		int money = s.nextInt();
		bank.deposit(500);
		System.out.println("current balance is:"+bank.getCurrentBalance());
		withdrawl(900);
		System.out.println("Total Balance is:"+bank.getCurrentBalance());

	}
}
