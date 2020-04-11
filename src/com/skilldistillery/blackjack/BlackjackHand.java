package com.skilldistillery.blackjack;

import java.util.List;

public class BlackjackHand extends Hand {
	// each hand begins with dealer and player getting two cards.
	// hands are dealt face up, except the dealers second card is face down.
	
	
	public BlackjackHand() {
		
	}
	
	@Override
	public int getHandValue() {
		// 10s, Jacks, Queens, Kings have a value of 10.
		// everything else face value.
		// Ace = 11.
		int totalvalue = 0;
		for (Card card : hand) {
			int value = card.getValue();
			totalvalue += value;
		}
	
		return totalvalue;
	}
	
	

	public boolean isBlackJack() {
		// if the handvalue is 21 auto win.
		// if the players hand is > dealers hand but not a bust
		// if the dealers hand is > players hand and not a bust
		return true;
	}
	
	public boolean isBust() {
		// if players hand or dealers hand is over 21.
		return true;
	}

	@Override
	public String toString() {
		return "BlackjackHand [hand=" + hand + "]";
	}


	

}
