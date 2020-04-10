package com.skilldistillery.blackjack;

import java.util.Arrays;

public class Dealer {
// has a private deck
// private hand of cards
// - shuffles the deck
// - moves cards to their hand and the players hand
// - dealer must hit if its under 17 pts.
// - dealer must stay if its over 17 pts.
	private Deck cardDeck = new Deck();
	private BlackjackHand dealersHand = new BlackjackHand();
	
	public Dealer () {
		
	}
	
	public void shuffleCards() {
		cardDeck.shuffle();
	}
	
	public void printDeck() {
		System.out.println(cardDeck.toString());
	}
	
	public void dealTwoCardsAtStart() {
		shuffleCards();
		Card card1 = cardDeck.dealCard();
		Card card2 = cardDeck.dealCard();
		dealersHand.addCard(card1);
		dealersHand.addCard(card2);
	}
	
	public Card dealCardToPlayer() {
		Card playercard = cardDeck.dealCard();
		
		return playercard;
		
	}
	
	
}
