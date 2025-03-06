# Card Deck Program in Java

## 📌 Overview

This is a **menu-driven Java program** that simulates a deck of 52 playing cards. It allows users to perform various operations such as shuffling the deck, printing cards, searching for a specific card, dealing random cards, and more.

The program follows **object-oriented principles** and consists of multiple Java files to maintain modularity and clarity.

## 🛠 Features

✔ **CreateDeck** – Initializes a deck of 52 playing cards.\
✔ **PrintDeck** – Displays all the cards in the deck.\
✔ **PrintCard** – Prints a specific card based on its index.\
✔ **SameCard** – Finds and displays all cards of a given suit.\
✔ **CompareCard** – Finds and displays all cards of a given rank.\
✔ **FindCard** – Searches for a specific card by rank and suit.\
✔ **DealCard** – Deals 5 random cards from the deck.\
✔ **ShuffleDeck** – Shuffles the deck randomly.

## 📁 Project Structure

```
|-- CardDeckProgram
    |-- src
        |-- Card.java       # Represents a single playing card
        |-- Deck.java       # Manages deck operations
        |-- Main.java       # Contains the menu-driven program logic
    |-- README.md           # Documentation
```

## 🚀 How to Run the Program

### 1️⃣ Clone the Repository

```sh
git clone https://github.com/your-username/CardDeckProgram.git
cd CardDeckProgram/src
```

### 2️⃣ Compile the Java Files

```sh
javac Main.java
```

### 3️⃣ Run the Program

```sh
java Main
```

## 📜 Usage Guide

Once you run the program, you will see a **menu-driven interface** like this:

```
===== Card Deck Menu =====
1. Print Deck
2. Shuffle Deck
3. Print a Specific Card
4. Find Cards with Same Suit
5. Compare Cards with Same Rank
6. Search for a Specific Card
7. Deal 5 Random Cards
8. Exit
Enter your choice:
```

You can enter a choice (1-8) to perform different operations.

## 📝 Coding Guidelines Followed

✅ **Encapsulation**: The `Card` and `Deck` classes encapsulate their properties and behaviors.\
✅ **Modular Design**: Each operation is implemented as a separate method.\
✅ **Code Readability**: Proper comments and structured formatting are used.\
✅ **User-Friendly**: The program provides clear prompts and feedback.

## 🏗 Future Improvements

🔹 Enhance the user interface using a GUI (Swing/JavaFX).\
🔹 Implement additional game-related functionalities.\
🔹 Save and load deck state to/from a file.

##
