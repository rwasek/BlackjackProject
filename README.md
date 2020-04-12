## Blackjack Project - Week 4 Skill Distillery

### Overview

 A text based, Command-line Blackjack game that was designed using an Object-Oriented class structure.  The program starts with a Player and a Dealer.  The Dealer automatically deals cards from a standard 52-card deck that shrinks as cards are removed to be dealt.  If the Player gets 21 on the first deal, they win, however if the Player and the Dealer both get 21 on the first deal.. the Dealer wins.  The dealer is forced to stay if the value of their hand is 17 or above, and forced to hit if they have less than 17.  It is an automatic loss for whoever Busts first (goes over 21).  If the player gets 21 through hitting, the Dealer still has a chance to hit if they are under 17; if the Dealer gets 21 from hitting here, then it is a Push/Tie and the player gets their bet back.  

### Technologies Used

- Eclipse

- Java

- Terminal Commands

- GitHub/Git

- Google


### Lessons Learned

- The most difficult part of this was designing the class structure.  I made my card Hand class a Superclass so it can be used in other games, extending BlackjackHand as it's subclass to show the proper use of Polymorphism. My Dealer class contained a Deck of cards, so the dealer could be used for other card game programs.

- Got more practice with Encapsulation, and really understanding it more.  The Dealer and Player classes had private Lists of Hands of Cards that I was able to reference using getters and setters.  I even created a copy of the Dealers Blackjack Hand within the Dealer class to prevent the original from being tampered with.. This way I could hide their first card at the initial draw, and show their second card only in the main program.

- Extensive use of methods; being able to piggy back method calls on each other in logical manners depending on relationships between classes.

- This project would have been very easy to code all in a Main application, however I tried doing a lot of the work in the corresponding classes, such as the Dealer class, so my main consisted primarily of method calls and interactions, so the code is much cleaner.
