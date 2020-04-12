package com.skilldistillery.blackjack;


public class BlackjackHand extends Hand {

	public BlackjackHand() {

	}

	@Override
	public int getHandValue() {
		int totalvalue = 0;
		for (Card card : hand) {
			int value = card.getValue();
			totalvalue += value;
		}

		return totalvalue;
	}

	public boolean isBlackJack() {
		if (getHandValue() == 21) {
			return true;
		} else {
			return false;
		}
	}

	public boolean isBust() {
		if (getHandValue() > 21) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public String toString() {
		return "Hand " + hand;
	}

}
