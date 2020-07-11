package com.javase.hotel_1;

import org.omg.CORBA.PUBLIC_MEMBER;

public class Customer {
	//声明三个私有对象属性。firstName,lastName,account
	private String firstName;
	private String lastName;
	
	//代表用户有的账户属性
	private Account account;
	
	public Customer(String f, String l) {
		firstName = f;
		lastName = l;
	}
	
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
		
	}
	public String getFirstName() {
		return firstName;
	}
}
