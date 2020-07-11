package com.javase.hotel_4;

public class Bank {
	private Customer[] customers;
	private int numberOfCustomer;
	
	public Bank() {
		customers = new Customer[5];
	}
	
	/**
	 * ���ݴ���Ĳ�������һ���µ�Customer���󣬲��Ѹö��󸳸� customers��ָ����Ԫ��
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
