package com.javase.hotel_4;

public class Bank {
	private Customer[] customers;
	private int numberOfCustomer;
	
	public Bank() {
		customers = new Customer[5];
	}
	
	/**
	 * 根据传入的参数创建一个新的Customer对象，并把该对象赋给 customers中指定的元素
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
	
	public Customer getCustomer(int index) {
		return customers[index];
	}
	
}
