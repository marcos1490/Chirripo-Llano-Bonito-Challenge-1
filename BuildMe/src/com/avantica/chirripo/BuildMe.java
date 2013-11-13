package com.avantica.chirripo;

public class BuildMe {

	public static void main(String[] args) {
		System.out.println("Welcome to Build Me!");
		
		Subscription s = new Subscription(1000, 2);
		System.out.println(String.format("Price per month is: %f", s.pricePerMonth()));
	}
	
}
