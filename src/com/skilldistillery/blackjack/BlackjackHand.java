package com.skilldistillery.blackjack;

public class BlackjackHand extends Hand {
	// each hand begins with dealer and player getting two cards.
	// hands are dealt face up, except the dealers second card is face down.

	@Override
	public int getHandValue() {
		// 10s, Jacks, Queens, Kings have a value of 10.
		// everything else face value.
		// Ace = 11.
		return 0;
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

}
