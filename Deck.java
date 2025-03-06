// Deck.java

import java.util.*;
class Deck{
	ArrayList<Card> deck;

	// Constructor to create deck
    	public Deck() {
        	this.deck = new ArrayList<>();
        	createDeck();
    	}

	public void createDeck(){
		String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
		String[] suits = {"Clubs","Diamonds","Spades","Hearts"};

		for (String rank : ranks){
			for (String suit : suits){
				deck.add(new Card(rank, suit));
			}
		}
	}

	public void printDeck() {
        	System.out.println("***** Deck *****");
        	for (Card card : deck) {
            		System.out.println(card);
        }
    }

	public void shuffleDeck(){
		System.out.println("Shufflig Deck");
		Collections.shuffle(deck);
	}

	public void printCard(int index) {
        if (index >= 0 && index < deck.size()) {
            System.out.println("Selected Card: " + deck.get(index));
        } else {
            System.out.println("Invalid card index!");
        }
    }

	public void sameCard(String suit) {
        System.out.println("Cards with suit: " + suit);
        for (Card card : deck) {
            if (card.suit.equalsIgnoreCase(suit)) {
                System.out.println(card);
            }
        }
    }

	public void compareCard(String rank) {
        System.out.println("Cards with rank: " + rank);
        for (Card card : deck) {
            if (card.rank.equalsIgnoreCase(rank)) {
                System.out.println(card);
            }
        }
    }




	public void pickTwo(){
		System.out.println("");
	}

}
