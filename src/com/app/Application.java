package com.app;

import com.claim.Card;
import com.claim.Discover;
import com.claim.Mastercard;
import com.claim.Visa;

public class Application {
	public static void main(String[] args){
		Card card1 = new Mastercard();
		Card card2 = new Visa();
		Card card3 = new Discover();
		
		//Following is illegal, must specify card type
		//Card card4 = new Card();
		//Following is illegal, can't store different type in the array
		//Visa[] visa = {card1, card2, card3};
		
		Card[] cards = {card1, card2, card3};
		double sum = 0;
		for(int i = 0; i<cards.length; i++){
			sum += cards[i].CalculateInterest();
		}
		
		System.out.println(sum);
	}
}
