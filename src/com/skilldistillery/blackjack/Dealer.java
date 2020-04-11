package com.skilldistillery.blackjack;

import java.util.ArrayList;
import java.util.List;

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
		this.cardDeck.shuffle();
	}
	
	public void printDeck() {
		System.out.println(cardDeck.toString());
		// just a test method to make sure the deck was working correctly.
	}
	
	public void addCardsToDealerHand() {
		int count = 0;
		while (count != 2) {
		Card dealercard = dealCardToDealer();
		dealersHand.addCard(dealercard);
		count++;
		}	
	}
	
	public void addOneCardToDealerHand() {
		Card dealercard = dealCardToDealer();
		dealersHand.addCard(dealercard);
	}
	
	public Card dealCardToDealer() {
		Card dealercard = cardDeck.dealCard();
		return dealercard;
	}
	
	public Card dealCardToPlayer() {
		Card playercard = cardDeck.dealCard();
		return playercard;
		
	}

	public Deck getCardDeck() {
		return cardDeck;
	}

	public void setCardDeck(Deck cardDeck) {
		this.cardDeck = cardDeck;
	}

	public BlackjackHand getDealersHand() {
		return dealersHand;
	}

	public void setDealersHand(BlackjackHand dealersHand) {
		this.dealersHand = dealersHand;
	}

	public void displayHand() {
		System.out.println(toString());
	}
	
	public void displayPartialHand() {
		
		List<Card> defensiveList = new ArrayList<>();
		defensiveList.addAll(dealersHand.getHand());
		for (int i = 1; i < defensiveList.size(); i++) {
			if (i == 1) {
			System.out.print("The second card of the dealers hand is: ");
			System.out.println(defensiveList.get(i).toString());
			}
			else {
				System.out.print("The next card of the dealers hand is: ");
				System.out.println(defensiveList.get(i).toString());
			}
		}
	
		
			
	}
	@Override
	public String toString() {
		return "Dealers " + dealersHand;
	}
	
	
}
