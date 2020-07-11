package com.javase.hotel_9;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 
 * @author Admin
 *
 */
public class Bank {
	private List<Customer> customers;
	private Bank() {
		customers = new ArrayList<Customer>();
	}
	
	private static Bank instance = new Bank();
	public static Bank getBank() {
		return instance;
	}
	
	/**
	 * @param firstName
	 * @param lastName
	 */
	
	public void addCustomer(String firstName,String lastName) {
		Customer cust = new Customer(firstName,lastName);
		
		
		customers.add(cust);
	}
	
	/**
	 * @return
	 */
	
	public int getNumOfCustomers() {
		return customers.size();
	}
	
	/**
	 * @param index
	 * @return
	 */
	
	public Customer getCustomer(int index) {
		return customers.get(index);
	}
	public Iterator<Customer> getCustomers(){
		return customers.iterator();
	}
}
