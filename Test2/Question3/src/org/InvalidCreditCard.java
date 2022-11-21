package org;

public class InvalidCreditCard extends Exception {

	public InvalidCreditCard() {}
	
	public InvalidCreditCard(String msg) {
		super(msg);
	}
}