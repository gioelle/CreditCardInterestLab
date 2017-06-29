package com.claim;

public class Visa extends Card {
	private double interestRate = 0.10;
	public double CalculateInterest() {
		return this.balance*interestRate;
	}

}
