package com.skilldistillery.blackjack;

import java.util.Scanner;

public class BlackjackGameApp {
	// has a dealer
	// has a player
	Dealer dealer = new Dealer();
	Player player = new Player();
	Scanner kb = new Scanner(System.in);
	boolean playerstayed = false;

	public static void main(String[] args) {
		BlackjackGameApp newGame = new BlackjackGameApp();

		newGame.launchGame();
	}

	public void launchGame() {
		dealer.shuffleCards();
		firstDeal();
		nextMoveMenu();

	}

	public void firstDeal() {
		System.out.println("Let's play BlackJack!");
		System.out.println("The dealer deals out 2 cards to the player and themselves!\n");
		dealer.addCardsToDealerHand();
		int count = 0;
		while (count != 2) {
			Card playercard = dealer.dealCardToPlayer();
			player.getDealt(playercard);
			count++;
		}
		dealer.displayPartialHand();
//		dealer.displayHand(); just for testing purposes initially.
		player.displayHand();
		System.out.println("Your hand currently has a value of: " + calculatePlayerHandValue());
		calculateDealersHandValue();
		checkForBlackJackOrBust();
	}

	public void checkForBlackJackOrBust() {
		if (dealer.getDealersHand().isBlackJack() == true) {
			System.out.println("Dealer has BlackJack! Dealer wins!");
			System.exit(0);
		}
		else if (player.getPlayersHand().isBlackJack() == true) {
			System.out.println("Player has BlackJack! Player wins!");
			System.exit(0);
		}
		else if (dealer.getDealersHand().isBust() == true) {
			System.out.println("Dealer goes over 21! Dealer Busts and the Player wins!");
			System.exit(0);
		}
		else if (player.getPlayersHand().isBust() == true) {
			System.out.println("Player goes over 21! Player Busts and the Dealer wins!");
			System.exit(0);
		}
	}

	public int calculateDealersHandValue() {
		// to be used for calculations not to display.
		int value = dealer.getDealersHand().getHandValue();
		return value;

	}

	public int calculatePlayerHandValue() {
		int playersValue = player.getPlayersHand().getHandValue();
		return playersValue;

	}
	
	public void dealerLogic() {
		if (calculateDealersHandValue() >= 17) {
			System.out.println("Dealer stays");
//			System.out.println("Dealer had ");
//			System.out.println(calculateDealersHandValue());
//			dealer.displayHand();
			if (calculateDealersHandValue() > calculatePlayerHandValue()) {
				System.out.println("Dealer wins!");
				System.out.print("Dealer had ");
				System.out.println(calculateDealersHandValue());
				dealer.displayHand();
				System.exit(0);
			}
			else if (calculateDealersHandValue() < calculatePlayerHandValue()) {
				System.out.println("Player wins!");
				System.exit(0);
			}
		}
		while (calculateDealersHandValue() < 17 || ((calculateDealersHandValue() < 17) && (playerstayed == true))) {
			System.out.println("Dealer hits");
			dealer.addOneCardToDealerHand();
			
			dealer.displayHand();
//			System.out.println(calculateDealersHandValue());
			checkForBlackJackOrBust();
			
		}
		if (calculateDealersHandValue() > calculatePlayerHandValue()) {
			System.out.println("Dealer wins!");
			System.out.print("Dealer had ");
			System.out.println(calculateDealersHandValue());
			dealer.displayHand();
			System.exit(0);
		}
		else if (calculateDealersHandValue() < calculatePlayerHandValue()) {
			System.out.println("Player wins!");
			System.exit(0);
		}
	}
	
	public void checkForTie() {
		if (calculateDealersHandValue() == calculatePlayerHandValue());
		System.out.println("Tie! Player gets their bet back!");
		System.exit(0);
	}

	public void nextMoveMenu() {
		System.out.println("1. Hit");
		System.out.println("2. Stay");

		int choice = kb.nextInt();

		switch (choice) {

		case 1:
			player.hit();
			Card playercard = dealer.dealCardToPlayer();
			player.getDealt(playercard);
			player.displayHand();
			System.out.println("Your hand currently has a value of: " + calculatePlayerHandValue());
			checkForBlackJackOrBust();
			nextMoveMenu();
			break;

		case 2:
			player.stay();
			playerstayed = true;
			dealerLogic();
			checkForTie();
			while (calculateDealersHandValue() <= 17) {
			dealerLogic();
			checkForTie();
			}
			break;
		}
	}

}
