package com.javatutorials.encapsulation;

public class bankMethod {
	
	    public static void main(String[] args) {
	        BankAccount account = new BankAccount("12345", 1000.0);

	        // Accessing account information indirectly
	        System.out.println("Account Number: " + account.getAccountNumber());
	        System.out.println("Balance: " + account.getBalance());

	        // Depositing money
	        account.deposit(100);
	        System.out.println("Updated Balance: " + account.getBalance());

	        // Withdrawing money
	        account.withdraw(200);
	        System.out.println("Updated Balance: " + account.getBalance());
	    }
	


}



