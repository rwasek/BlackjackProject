package com.skilldistillery.blackjack;

public class Player {
	private BlackjackHand playersHand = new BlackjackHand();
	
	public Player() {
		
	}
	
	public void playHand() {
		
	}
	
	public void hit() {
		System.out.println("You tell the dealer: \"Hit me!\"");
	
	}
	
	public void stay() {
		System.out.println("You tell the dealer: \"I'll stay!\"");
	}
	
	public void getDealt(Card card) {
		playersHand.addCard(card);
	}
	
	public void displayHand() {
		System.out.println(toString());
	}

	@Override
	public String toString() {
		return "Your " + playersHand + "";
	}

	public BlackjackHand getPlayersHand() {
		return playersHand;
	}

	public void setPlayersHand(BlackjackHand playersHand) {
		this.playersHand = playersHand;
	}
	
	
}
