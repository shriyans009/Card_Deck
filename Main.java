//Main.java

import java.util.*;

class Main{
	public static void main(String args[]){
		Deck deck = new Deck();
		System.out.println("***** Creating Deck *****");
		deck.createDeck();
		System.out.println("***** Deck Created *****");
		//deck.displayDeck();

		//Shuffling deck
		System.out.println("***** Deck Shuffle *****");
		deck.shuffleDeck();
		System.out.println("***** Pick two *****");
		deck.pickTwo();
	}
}