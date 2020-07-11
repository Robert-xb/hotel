package com.javase.hotel_6;

public class Bank {
	private Customer[] customers;
	
	private int numberOfCustomer;
	
	public Bank() {
		customers = new Customer[5];
	}
	/**
	 * @param firstName
	 * @param lastName
	 */
	
	public void addCustomer(String firstName,String lastName) {
		Customer cust = new Customer(firstName,lastName);
		customers[numberOfCustomer] = cust;
		numberOfCustomer++;
	}
	/**
	 * @return
	 */
	
	public int getNumOfCustomers() {
		return numberOfCustomer;
	}
	
	/**
	 * @param index
	 * @return
	 */
	
	public Customer getCustomer(int index) {
		return customers[index];
	}
}
