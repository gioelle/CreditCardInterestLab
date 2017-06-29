package com.claim;

public class Mastercard extends Card {
	private double interestRate = .05;

	public double CalculateInterest() {
		// TODO Auto-generated method stub
		return (this.balance * interestRate);
	}
}
