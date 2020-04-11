package com.skilldistillery.blackjack;


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
		firstDeal();
//		dealer.printDeck();
		
	}
	
	public void firstDeal() {
		dealer.addCardsToDealerHand();
		int count = 0;
		while (count != 2) {
		Card playercard = dealer.dealCardToPlayer();
		player.getDealt(playercard);
		count++;
		}
		System.out.println(dealer.getDealersHand());
		player.displayHand();
		int value = player.playersHand.getHandValue();
		System.out.println(value);
	}
	
	

}
