package com.javase.hotel.test;

import com.javase.hotel_8.Account;
import com.javase.hotel_8.Bank;
import com.javase.hotel_8.Customer;
import com.javase.hotel_8.CheckingAccount;
import com.javase.hotel_8.OverdraftException;
import com.javase.hotel_8.SavingAccount;

public class test_8 {
	public static void main(String[] args) {
		Bank bank = Bank.getBank();
		Customer customer;
		Account account;
		
		bank.addCustomer("Jane","Simms");
		customer = bank.getCustomer(0);
		customer.addAccount(new SavingAccount(500.00,0.05));
		
		customer.addAccount(new CheckingAccount(200.00,500.00));
		bank.addCustomer("Owen","Bryant");
		customer = bank.getCustomer(1);
		customer.addAccount(new CheckingAccount(200.00));
		
		customer = bank.getCustomer(0);
		account = customer.getAccount(1);
		System.out.println("Customer [" + customer.getLastName() + ", " + customer.getFirstName() + "]" + "has a checking balance of " + account.getBalance() + " with a 500.00 overdraft protection. ");
		try {
			System.out.println("Checking Acct [Jane Simms] : withdraw 150.00");
			account.withdraw(150.00);
			System.out.println("Checking Acct [Jane Simms] : deposit 22.50");
			account.deposit(22.50);
			System.out.println("Checking Acct [Jane Simms] : withdraw 147.62");
			account.withdraw(147.62);
			System.out.println("Checking Acct [Jane Simms] : withdraw 470.00");
			account.withdraw(470.00);
		} catch(OverdraftException el) {
			System.out.println("Exception: " + el.getMessage() + "  Deficit: " + el.getDeficit());
		} finally {
			System.out.println("Customer [" + customer.getLastName() + ", " + customer.getFirstName() + "]" + " has a checking balance of " + account.getBalance());
		}
		
		System.out.println();
		
		customer = bank.getCustomer(1);
		account = customer.getAccount(0);
		System.out.println("Customer [" + customer.getLastName() + ", " + customer.getFirstName() + "]" + " has a checking balance of " + account.getBalance());
		
		try {
			System.out.println("Checking Acct [Owen Bryant] : withdraw 100.00");
			account.withdraw(100.00);
			System.out.println("Checking Acct [Owen Bryant] : deposit 25.00");
			account.deposit(25.00);
			System.out.println("Checking Acct [Owen Bryant] : withdraw 175.00");
			account.withdraw(175.00);
		} catch(OverdraftException el) {
			System.out.println("Exception: " + el.getMessage() + " Deficit: " + el.getDeficit());
		} finally {
			System.out.println("Customer [" + customer.getLastName() + ", " + customer.getFirstName() + "]" + " has a checking balance of " + account.getBalance());
		}
	}
}
