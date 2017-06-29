package com.claim;

public class Discover extends Card {
	private double interestRate = 0.01;
	public double CalculateInterest() {
		return interestRate*this.balance;
	}

}
