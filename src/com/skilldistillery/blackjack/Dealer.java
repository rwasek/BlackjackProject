package com.skilldistillery.blackjack;


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
	}
	
	public void addCardsToDealerHand() {
		int count = 0;
		while (count != 2) {
		Card dealercard = dealCardToDealer();
		dealersHand.addCard(dealercard);
		count++;
		}
		
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
	
	
}
