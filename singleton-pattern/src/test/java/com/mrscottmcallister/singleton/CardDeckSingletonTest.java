package com.mrscottmcallister.singleton;

import junit.framework.TestCase;

import java.util.LinkedList;

/**
 * Created by scottmcallister on 2017-07-29.
 */
public class CardDeckSingletonTest extends TestCase {
    public void testGetInstance() throws Exception {
        CardDeckSingleton firstInstance = CardDeckSingleton.getInstance();
        CardDeckSingleton secondInstance = CardDeckSingleton.getInstance();
        assertEquals(System.identityHashCode(firstInstance), System.identityHashCode(secondInstance));
    }

    public void testGetCardList() throws Exception {
        CardDeckSingleton deckSingleton = CardDeckSingleton.getInstance();
        LinkedList<String> cardList = deckSingleton.getCardList();
        assertEquals(cardList.size(), 52);
    }

    public void testDrawCards() throws Exception {
        CardDeckSingleton deckSingleton = CardDeckSingleton.getInstance();
        LinkedList<String> hand = deckSingleton.drawCards(5);
        LinkedList<String> restOfDeck = deckSingleton.getCardList();
        assertEquals(hand.size(), 5);
        assertEquals(restOfDeck.size(), 47);

        // put back cards or next test will fail
        deckSingleton.putBackCards(hand);
    }

    public void testPutBackCards() throws Exception {
        CardDeckSingleton deckSingleton = CardDeckSingleton.getInstance();
        LinkedList<String> hand = deckSingleton.drawCards(10);
        deckSingleton.putBackCards(hand);
        LinkedList<String> cardList = deckSingleton.getCardList();
        assertEquals(cardList.size(), 52);
    }

    public void testShuffleCards() throws Exception {
        CardDeckSingleton deckSingleton = CardDeckSingleton.getInstance();
        String topCard = deckSingleton.getCardList().getFirst();
        CardDeckSingleton.shuffleCards();
        String secondTopCard = deckSingleton.getCardList().getFirst();
        assertNotSame(topCard, secondTopCard);
    }

}