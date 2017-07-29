package com.mrscottmcallister.singleton;

import java.util.LinkedList;

public class App
{
    public static void main( String[] args )
    {
        CardDeckSingleton deck = CardDeckSingleton.getInstance();
        System.out.println("First instance ID: " + System.identityHashCode(deck) + "\n");
        CardDeckSingleton secondDeck = CardDeckSingleton.getInstance();
        System.out.println("Second instance ID: " + System.identityHashCode(secondDeck) + "\n");
        System.out.println("List of Cards: \n" + deck.getCardList() + "\n");
        LinkedList<String> playerOneHand = deck.drawCards(5);
        System.out.println("Player's Hand: \n" + playerOneHand + "\n");
        System.out.println("Deck after drawing hand: \n" + deck.getCardList() + "\n");

    }
}
