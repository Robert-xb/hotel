package com.javase.hotel.test;

import com.javase.hotel_2.Account;
import com.javase.hotel_2.Customer;

public class test_2 {
	public static void main(String[] args) {
		Customer customer;
		customer = new Customer("Jane","Smith");
		
		System.out.println("Creating her account with a 500.00 balance.");
		customer.setAccount(new Account(500));
		System.out.println("Withraw 150.00");
		customer.getAccount().withdraw(150);
		System.out.println("Deposit 22.50");
		customer.getAccount().deposit(22.50);
		System.out.println("Withdraw 47.62");
		customer.getAccount().withdraw(47.62);
		
		System.out.println("Customer["+customer.getLastName() + "," + customer.getFirstName() + "] has a balance of " + customer.getAccount().getBalance());
		
		
	}
}
