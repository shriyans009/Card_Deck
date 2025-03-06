// Main.java
// Name: Shriyans Sahoo
// PRN: 23070126125
// Batch: AIML-B2

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Deck deck = new Deck();
        
        int choice;
        do {
            System.out.println("\n===== Card Deck Menu =====");
            System.out.println("1. Print Deck");
            System.out.println("2. Shuffle Deck");
            System.out.println("3. Print a Specific Card");
            System.out.println("4. Find Cards with Same Suit");
            System.out.println("5. Compare Cards with Same Rank");
            System.out.println("6. Search for a Specific Card");
            System.out.println("7. Deal 5 Random Cards");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");
            
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            
            switch (choice) {
                case 1:
                    deck.printDeck();
                    break;
                case 2:
                    deck.shuffleDeck();
                    break;
                case 3:
                    System.out.print("Enter card index (0-51): ");
                    int index = scanner.nextInt();
                    deck.printCard(index);
                    break;
                case 4:
                    System.out.print("Enter suit (Clubs, Diamonds, Spades, Hearts): ");
                    String suit = scanner.nextLine();
                    deck.sameCard(suit);
                    break;
                case 5:
                    System.out.print("Enter rank (2-10, Jack, Queen, King, Ace): ");
                    String rank = scanner.nextLine();
                    deck.compareCard(rank);
                    break;
                case 6:
                    System.out.print("Enter rank: ");
                    String findRank = scanner.nextLine();
                    System.out.print("Enter suit: ");
                    String findSuit = scanner.nextLine();
                    deck.findCard(findRank, findSuit);
                    break;
                case 7:
                    deck.dealCard();
                    break;
                case 8:
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 8);

        scanner.close();
    }
}
