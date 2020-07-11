package com.javase.hotel_3;

public class Bank {
	//��ǰBank���ж��Customer 
	private Customer[] customers;
	//��ʾcustomers�������ж��ٸ�������Customer����
	
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
		//1.���ݴ���Ĳ�������һ���µ�Customer ����
		Customer cust = new Customer(firstName, lastName);
		//2.��1���´�����Customer���󸳸�customers��ָ����Ԫ��
		customers[numberOfCustomer] = cust;
		//3.ʹ��ʾcustomers�������ж��ٸ�������Customer ��������� +1 
		numberOfCustomer++;
	}
	
	/**
	 * ���ر�ʾ customers �������ж��ٸ�������Customer ��������� 
	 * @return
	 */
	
	public int getNumOfCustomers() {
		return numberOfCustomer;
	}
	
	/**
	 * ����ָ��������Ӧ��Customer����
	 * @param index
	 * @return
	 */
	
	public Customer getCustomer(int index) {
		return customers[index];
	}
	
}
