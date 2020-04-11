package com.skilldistillery.blackjack;

public class Player {
// has a public blackjackhand of cards
// can play the hands
// hits to get another card
// can stay/
	public BlackjackHand playersHand = new BlackjackHand();
	
	public Player() {
		
	}
	
	public void playHand() {
		
	}
	
	public void hit() {
		
	}
	
	public void stay() {
		
	}
	
	public void getDealt(Card card) {
		playersHand.addCard(card);
	}
	
	public void displayHand() {
		System.out.println(playersHand.toString());
	}

	@Override
	public String toString() {
		return "Player [playersHand=" + playersHand + "]";
	}
	
	
}
