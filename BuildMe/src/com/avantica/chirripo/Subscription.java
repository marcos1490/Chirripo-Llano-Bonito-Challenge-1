package com.avantica.chirripo;

/**
 * An instance of it represents a subscription to something (e.g. newspaper, 
 * but it doesn’t really matter here). Each subscription has its total price, 
 * stored in the variable price. This price is in Euro-cent. It also has the 
 * length of the subscription, given in months.
 * 
 * For example, new Subscription(1000,2) will create a new subscription of 
 * 1000 Euro-cent for the total period of 2 months.
 * 
 * By the way, the class has a number of bugs; e.g. pricePerMonth is supposed 
 * to return the price per month in euro. However it calculates the price in cent.
 * @author rovargas
 *
 */
public class Subscription {

	private int price; // subscription total price in euro-cent
	private int length; // length of subscription in months

	// constructor
	public Subscription(int p, int n) {
		price = p;
		length = n;
	}

	/**
	 * Calculate the monthly subscription price in euro,
	 * rounded up to the nearest cent.
	 */
	public double pricePerMonth() {
		double r = (double) price / (double) length;
		return r;
	}

	/**
	 * Call this to cancel/nulify this subscription.
	 */
	public void cancel() { length = 0; }

}