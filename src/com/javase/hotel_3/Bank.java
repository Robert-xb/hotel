package com.javase.hotel_3;

public class Bank {
	//当前Bank中有多个Customer 
	private Customer[] customers;
	//表示customers变量中有多少个真正的Customer对象
	
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
		//1.根据传入的参数创建一个新的Customer 对象
		Customer cust = new Customer(firstName, lastName);
		//2.把1中新创建的Customer对象赋给customers中指定的元素
		customers[numberOfCustomer] = cust;
		//3.使表示customers变量中有多少个真正的Customer 对象的整数 +1 
		numberOfCustomer++;
	}
	
	/**
	 * 返回表示 customers 变量中有多少个真正的Customer 对象的整数 
	 * @return
	 */
	
	public int getNumOfCustomers() {
		return numberOfCustomer;
	}
	
	/**
	 * 返回指定索引对应的Customer对象
	 * @param index
	 * @return
	 */
	
	public Customer getCustomer(int index) {
		return customers[index];
	}
	
}
