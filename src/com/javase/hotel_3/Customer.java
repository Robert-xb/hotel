package com.javase.hotel_3;

public class Customer {
	//��������˽�ж������ԣ�firstName,lastName,account
	private String firstName;
	private String lastName;
	
	//�����û��е��˻�����
	
	private Account account;
	
	public Customer(String f,String l) {
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
	
	public String getLastName() {
		return lastName;
	}
	
}
