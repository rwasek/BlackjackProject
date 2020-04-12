package com.skilldistillery.blackjack;

import java.util.ArrayList;
import java.util.List;

public abstract class Hand {
	protected List<Card> hand = new ArrayList<>();
	
	public Hand() {
		
	}
	
	public void addCard(Card card) {
		hand.add(card);
	}
	
	public void clear() {
		hand.removeAll(hand);
	}
	
	public abstract int getHandValue();

	@Override
	public String toString() {
		return "Hand:" + hand + "]";
	}

	public List<Card> getHand() {
		return hand;
	}

	public void setHand(List<Card> hand) {
		this.hand = hand;
	}


	
	
	
	
}
