package com.skilldistillery.blackjack;

import java.util.Arrays;

public class BlackjackGameApp {
	// has a dealer
	// has a player
	Dealer dealer = new Dealer();
	Player player = new Player();
	 
	
	public static void main(String[] args) {
		BlackjackGameApp newGame = new BlackjackGameApp();
		
		newGame.launchGame();
	}
	
	public void launchGame() {
		dealer.shuffleCards();
		dealer.printDeck();
	}

}
