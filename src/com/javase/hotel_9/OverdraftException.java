package com.javase.hotel_9;

public class OverdraftException extends RuntimeException {
	private static final long serialVersionUTD = 1L;
	
	private double deficit;
	public double getDeficit() {
		return deficit;
	}
	
	public OverdraftException(String message,double deficit) {
		super(message);
		this.deficit = deficit;
	}
}
