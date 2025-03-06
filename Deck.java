// Deck.java
// Contains deck operations like create, shuffle, deal, search, etc.

import java.util.*;

class Deck {
    ArrayList<Card> deck;

    // Constructor to create deck
    public Deck() {
        this.deck = new ArrayList<>();
        createDeck();
    }

    // Method to create a standard deck of 52 cards
    public void createDeck() {
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        String[] suits = {"Clubs", "Diamonds", "Spades", "Hearts"};

        for (String suit : suits) {
            for (String rank : ranks) {
                deck.add(new Card(rank, suit));
            }
        }
    }

    // Method to print the entire deck
    public void printDeck() {
        System.out.println("***** Deck *****");
        for (Card card : deck) {
            System.out.println(card);
        }
    }

    // Method to print a specific card
    public void printCard(int index) {
        if (index >= 0 && index < deck.size()) {
            System.out.println("Selected Card: " + deck.get(index));
        } else {
            System.out.println("Invalid card index!");
        }
    }

    // Method to shuffle the deck
    public void shuffleDeck() {
        Collections.shuffle(deck);
        System.out.println("Deck shuffled successfully!");
    }

    // Method to find and print all cards with the same suit
    public void sameCard(String suit) {
        System.out.println("Cards with suit: " + suit);
        for (Card card : deck) {
            if (card.suit.equalsIgnoreCase(suit)) {
                System.out.println(card);
            }
        }
    }

    // Method to compare two cards based on rank
    public void compareCard(String rank) {
        System.out.println("Cards with rank: " + rank);
        for (Card card : deck) {
            if (card.rank.equalsIgnoreCase(rank)) {
                System.out.println(card);
            }
        }
    }

    // Method to find and display a specific card
    public void findCard(String rank, String suit) {
        for (Card card : deck) {
            if (card.rank.equalsIgnoreCase(rank) && card.suit.equalsIgnoreCase(suit)) {
                System.out.println("Card found: " + card);
                return;
            }
        }
        System.out.println("Card not found in the deck.");
    }

    // Method to deal 5 random cards
    public void dealCard() {
        System.out.println("Dealing 5 random cards:");
        Collections.shuffle(deck);
        for (int i = 0; i < 5; i++) {
            System.out.println(deck.get(i));
        }
    }
}
