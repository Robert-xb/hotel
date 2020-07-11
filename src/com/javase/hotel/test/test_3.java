package com.javase.hotel.test;

import com.javase.hotel_3.Account;
import com.javase.hotel_3.Customer;
import com.javase.hotel_3.Bank;

public class test_3 {
	public static void main(String[] args) {
		Bank bank = new Bank();
		bank.addCustomer("Jane","Smms");
		bank.addCustomer("Owen","Bryant");
		bank.addCustomer("Tim","Soley");
		bank.addCustomer("Maria","Soley");
		for(int i = 0;i < bank.getNumOfCustomers();i++) {
			Customer customer = bank.getCustomer(i);
			System.out.println("Customer[" + (i + 1) + "] is " + customer.getLastName() + "," + customer.getFirstName());
		}
		
		
		
	}
}
