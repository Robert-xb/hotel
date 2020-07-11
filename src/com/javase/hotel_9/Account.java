package com.javase.hotel_9;

public class Account {
	protected double balance;
	public Account(double init_balance) {
		this.balance = init_balance;
	}
	
	public double getBalance() {
		return balance;
	}
	
	/**
	 * @param amt
	 * @return
	 */
	
	public boolean deposit(double amt) {
		this.balance += amt;
		return true;
	}
	
	/**
	 * @param amt
	 * @throw OverdraftException
	 */
	
	public void withdraw(double amt) {
		if(amt > balance) {
			throw new OverdraftException("×Ê½ð²»×ã",amt - balance);
		}
		
		this.balance -= amt;
	}
	
}
