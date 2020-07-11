package com.javase.hotel.test;
import com.javase.hotel_1.Account;

public class test_1 {
	public static void main(String[] args) {
		Account account = null;
		//Create an account that can has a 500.00balace.
		System.out.println("Creating an account with a 500.00 balance.");
		account = new Account(500);
		//code
		
		System.out.println("Withdraw 150.00.");
		//code 
		account.withdraw(150);
		
		System.out.println("Deposit 22.50");
		
		//code
		account.deposit(22.50);
		System.out.println("Withdraw 47.62");
		//code
		account.withdraw(47.62);
		
		//print out the final account balance;
		System.out.println("The account has a balace of" + account.getBalance());
		System.out.println("");
		System.out.println("");
		
		System.out.println("the first time to update ¹þ¹þ so cool!");
	}
	
}
